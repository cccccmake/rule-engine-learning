package launchers.fizzbuzz;


import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;

import rules.fizzbuzz.*;

/**
 * @author zhengnan
 * @date 2024/10/26 10:42
 */

public class FizzBuzzLauncher {
    private static final String NUMBER = "number";
    public static void main(String[] args) {
        Facts facts = new Facts();

        Rules rules = new Rules();
        rules.register(new FizzRule());
        rules.register(new BuzzRule());
        rules.register(new FizzBuzzRule(new FizzBuzzRule(), new BuzzRule()));
        rules.register(new NonFizzBuzzRule());

        DefaultRulesEngine defaultRulesEngine = new DefaultRulesEngine();

        for(int i = 0; i < 100; i++) {
            facts.put(NUMBER, i);
            defaultRulesEngine.fire(rules, facts);
        }
    }
}
