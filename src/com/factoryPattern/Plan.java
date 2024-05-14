package com.factoryPattern;

public abstract class Plan {

	protected Double rate;
	abstract void getRate();
	
	public void CalculateBill(int units) {
		
		System.out.println(rate*units);
	}
}
