package actions;

import org.jeasy.rules.api.Action;
import org.jeasy.rules.api.Facts;

import static common.GlobalConstants.TEMPERATURE;

public class DecreaseTemperatureAction implements Action {

	@Override
	public void execute (Facts facts) throws Exception {
		System.out.println("It is hot there");
		int temperature = facts.get(TEMPERATURE);
		temperature -= 1;
		facts.put(TEMPERATURE, temperature);
	}

	public static DecreaseTemperatureAction decreaseTemperature () {
		return new DecreaseTemperatureAction();
	}
}
