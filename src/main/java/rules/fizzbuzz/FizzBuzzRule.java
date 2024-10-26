package rules.fizzbuzz;


import org.jeasy.rules.support.UnitRuleGroup;

/**
 * @author zhengnan
 * @date 2024/10/26 10:34
 */

public class FizzBuzzRule extends UnitRuleGroup {
    public FizzBuzzRule(Object... rules) {
        for (Object rule : rules) {
            addRule(rule);
        }
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
