package com.jg.eval;

public interface IBicycle {


	public void changeGear(int newValue) ;
	void changeCadence(int newValue);
	public void speedUp(int increment);
	public void applyBrakes(int decrement);
	
}
