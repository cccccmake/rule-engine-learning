package launchers.aircondition;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.InferenceRulesEngine;
import org.jeasy.rules.core.RuleBuilder;

import static actions.DecreaseTemperatureAction.decreaseTemperature;
import static common.GlobalConstants.TEMPERATURE;
import static conditions.HighTemperatureCondition.itIsHot;

public class AirConditionLauncher {
	public static void main (String[] args) {
		Facts facts = new Facts();
		facts.put(TEMPERATURE, 30);
		Rule rule = new RuleBuilder().name("airConditionRule").description("This is the air condition rule builder desc")
			.when(itIsHot()).then(decreaseTemperature()).build();
		Rules rulesSet = new Rules();
		rulesSet.register(rule);
		// no longer DefaultRulesEngine
		// the InferenceRulesEngine will continuously select and fire candidate rules until no more rules are applicable
		InferenceRulesEngine engine = new InferenceRulesEngine();
		engine.fire(rulesSet, facts);
	}
}
