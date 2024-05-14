package com.adapterPattern;

public class AdapterCharger implements AppleCharger{

	private AndroidCharger androidCharger;
	
	public AdapterCharger(AndroidCharger androidCharger) {
		super();
		this.androidCharger = androidCharger;
	}

	@Override
	public void getCharge() {
		androidCharger.getCharge();
	}

}
