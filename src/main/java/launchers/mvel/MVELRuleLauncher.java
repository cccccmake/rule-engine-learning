package launchers.mvel;

import model.Person;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRule;

public class MVELRuleLauncher {
    public static void main(String[] args) {
        Facts facts = new Facts();
        DefaultRulesEngine engine = new DefaultRulesEngine();
        // Rule 1: should operate a Person instance, check if the person age is greater than 18 and set the adult flag.
        Person personFoo = Person.builder().name("Foo").age(18).build();
        facts.put("personFoo", personFoo);
        MVELRule mvelRule1 = new MVELRule().name("MVELRule1").description("should operate a Person instance, check if the person age is greater than 18 and set the adult flag").priority(1).when("personFoo.age >= 18").then("personFoo.setAdult(true);");
        // Rule 2: should operate a Person instance, check if the person is adult and deny children (ie, non-adult) from buying alcohol.
        MVELRule mvelRule2 = new MVELRule().name("MVELRule2").description("check if the person is adult and deny children").priority(2).when("personFoo.isAdult() == false").then("System.out.println(\"U r not allowed to buy alcohols\");");
        Rules rulesSet = new Rules();
        rulesSet.register(mvelRule1, mvelRule2);
        System.out.println(personFoo.isAdult());
        engine.fire(rulesSet, facts);
        System.out.println(personFoo.isAdult());
    }
}
