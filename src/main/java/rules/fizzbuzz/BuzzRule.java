package rules.fizzbuzz;


import org.jeasy.rules.annotation.*;

/**
 * @author zhengnan
 * @date 2024/10/26 10:31
 */

@Rule(name = "Buzz Rule", description = "FizzBuzz Rule")
public class BuzzRule {
    @Condition
    public boolean when(@Fact("number") int number) {
        return number % 7 == 0;
    }

    @Action
    public void printBuzz() {
        System.out.println("buzz");
    }

    @Priority
    public int getPriority() {
        return 2;
    }
}
