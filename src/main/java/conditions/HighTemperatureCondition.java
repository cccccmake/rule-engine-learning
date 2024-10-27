package conditions;

import org.jeasy.rules.api.Condition;
import org.jeasy.rules.api.Facts;

import static common.GlobalConstants.TEMPERATURE;

public class HighTemperatureCondition implements Condition {
    @Override
    public boolean evaluate(Facts facts) {
        int temperature = facts.get(TEMPERATURE);
        return temperature > 25;
    }

    public static HighTemperatureCondition itIsHot() {
        return new HighTemperatureCondition();
    }
}
