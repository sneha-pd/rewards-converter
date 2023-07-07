import static org.junit.Assert.*;

import org.junit.Test;

/*import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;*/

public class RewardValueTests {
	private static final double DELTA = 0.001;

    @Test
    public void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(),DELTA);
    }

    @Test
    public void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
    
    @Test
    public void convert_from_cash_to_miles() {
    	double cashValue = 100;
        int expectedMiles = (int) (cashValue / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    public void convert_from_miles_to_cash() {
    	int milesValue = 10000;
        double expectedCash = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue(), DELTA);
    }
}
