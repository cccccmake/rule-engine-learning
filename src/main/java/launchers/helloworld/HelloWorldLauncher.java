package launchers.helloworld;


import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;

import rules.helloworld.HelloWorldRule;

/**
 * @author zhengnan
 * @date 2024/10/26 10:29
 */

public class HelloWorldLauncher {
    public static void main(String[] args) {
        Facts facts = new Facts();
        // rules set
        Rules rules = new Rules();
        rules.register(new HelloWorldRule());
        DefaultRulesEngine defaultRulesEngine = new DefaultRulesEngine();
        defaultRulesEngine.fire(rules, facts);
    }
}
