package com.builderPattern;

public class BuilderDP {

	public static void main(String[] args) {
		Phone phone = Phone.PhoneBuilder.builder()
		.setOs("Android")
		.setRam(8)
		.setBattery(5000)
		.setProcessor("OctaCore")
		.build();
		
		System.out.println(phone);
	}
}
