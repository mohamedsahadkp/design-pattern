package com.dp.java.behavioral.observerpattern;

public class HexaObserver extends Observer {

	private Number number;

	public HexaObserver(Number number) {
		this.number = number;
		this.number.findObserver(this);
	}

	public void update() {
		System.out.println("Hexa Number : "
				+ Integer.toHexString(number.getNumber()));
	}

}
