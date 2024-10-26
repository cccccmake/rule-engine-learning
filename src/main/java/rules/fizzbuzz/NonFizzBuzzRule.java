package rules.fizzbuzz;


import org.jeasy.rules.annotation.*;

/**
 * @author zhengnan
 * @date 2024/10/26 10:38
 */

@Rule(name = "Non FizzBuzz Rule", description = "Non FizzBuzz Rule")
public class NonFizzBuzzRule {
    @Condition
    public boolean nonFizzBuzz(@Fact("number") int number) {
        return number % 5 != 0 && number % 7 != 0;
    }

    @Action
    public void printNonFizzBuzzNumber(@Fact("number") int number) {
        System.out.println(number);
    }

    @Priority
    public int getPriority() {
        return 3;
    }
}
