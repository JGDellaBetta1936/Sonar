package com.jg.eval;

public class ACMEBicycle implements IBicycle {
	int cadence;
    int speed;
    int gear = 1;
	private ACMEBicycle() {
	}

	public void changeCadence(int newValue) {
		this.cadence = newValue;

	}

	
	public void changeGear(int newValue) {
		this.gear = newValue;

	}

	
	public void speedUp(int increment) {
		this.speed = increment;

	}


	public void applyBrakes(int decrement) {
		this.speed = this.speed - decrement;

	}

}
