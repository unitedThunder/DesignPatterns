package com.adapterPattern;

public class IPhone {

	private AppleCharger appleCharger;

	public IPhone(AppleCharger appleCharger) {
		this.appleCharger = appleCharger;
	}
	
	public void chargeIPhone() {
		appleCharger.getCharge();
	}
}
