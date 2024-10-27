package mvel.demo;

import model.Person;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRule;
import utils.ExternalMethods;

import static common.GlobalConstants.UTIL;

public class TemplateDemo {
    public static void main(String[] args) {
        Facts facts = new Facts();
        DefaultRulesEngine engine = new DefaultRulesEngine();
        Rules rules = new Rules();
        Person personA = Person.builder().name("personA").age(29).build();
        Person personB = Person.builder().name("personB").age(27).build();
        facts.put("personA", personA);
        facts.put("personB", personB);
        facts.put(UTIL, new ExternalMethods());
        MVELRule mvelRuleComparingPersonAge = new MVELRule().name("mvel rule comparing person age").when("util.isPersonAOlderThanPersonB(personB, personA)").then("System.out.println(true);");
        rules.register(mvelRuleComparingPersonAge);
        engine.fire(rules, facts);
    }
}
