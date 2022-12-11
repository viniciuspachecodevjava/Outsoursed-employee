package entities;

public final class OutsoursedEmployee extends Employee {
	private Double additionalCharge;

	public OutsoursedEmployee() {
		super();
	}

	public OutsoursedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
