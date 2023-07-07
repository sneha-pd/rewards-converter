
public class RewardValue {

	private double cashValue;
	private double milesValue;

	// Constructor accepting cash value
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
		this.milesValue = cashValue / 0.0035;
	}

	// Constructor accepting miles value
	public RewardValue(double milesValue, boolean isMiles) {
		this.milesValue = milesValue;
		this.cashValue = milesValue * 0.0035;
	}

	// Method to get the cash value of the RewardValue
	public double getCashValue() {
		return cashValue;
	}

	// Method to get the miles value of the RewardValue
	public double getMilesValue() {
		return milesValue;
	}

}
