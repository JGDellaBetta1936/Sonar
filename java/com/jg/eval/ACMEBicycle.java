package com.jg.eval;

public class ACMEBicycle implements IBicycle {
	int cadence;
    int speed;
    int gear = 1;
	private ACMEBicycle() {
	}

	@Override
	public void changeCadence(int newValue) {
		this.cadence = newValue;

	}

	@Override
	public void changeGear(int newValue) {
		this.gear = newValue;

	}

	@Override
	public void speedUp(int increment) {
		this.speed = increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		this.speed = this.speed - decrement;

	}

}
