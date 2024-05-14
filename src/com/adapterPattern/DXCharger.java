package com.adapterPattern;

public class DXCharger implements AndroidCharger {

	@Override
	public void getCharge() {
		System.out.println("Phone getting charged by android charger..");

	}

}
