package rules.helloworld;


import org.jeasy.rules.annotation.*;

/**
 * @author zhengnan
 * @date 2024/10/26 10:27
 */

@Rule(name = "Hello World Rule", description = "Always say Hello to the World")
public class HelloWorldRule {
    @Condition
    public boolean when() {
        return true;
    }

    @Action
    public void then() {
        System.out.println("Hello, World!");
    }
}
