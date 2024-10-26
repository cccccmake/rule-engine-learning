package rules.fizzbuzz;


import org.jeasy.rules.annotation.*;

/**
 * @author zhengnan
 * @date 2024/10/26 10:31
 */

@Rule(name = "Fizz Rule", description = "FizzBuzz Rule")
public class FizzRule {
    @Condition
    public boolean when(@Fact("number") int number) {
        return number % 5 == 0;
    }

    @Action
    public void printFizz() {
        System.out.println("fizz");
    }

    @Priority
    public int getPriority() {
        return 1;
    }
}
