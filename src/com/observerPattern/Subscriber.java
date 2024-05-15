package com.observerPattern;

public class Subscriber implements Observer {

	String subName;

	Subscriber(String subName) {
		this.subName = subName;
	}

	@Override
	public void notified() {
		System.out.println("Hello "+ subName +" New video uploaded");
	}

}
