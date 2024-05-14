package com.adapterPattern;

public class Main {

	public static void main(String[] args) {
		
		AppleCharger charger = new AdapterCharger(new DXCharger());
		
		IPhone ph = new IPhone(charger);
		
		ph.chargeIPhone();
	}
	
	
	
	
}
