package com.dp.java.behavioral.observerpattern;

public class BinaryObserver extends Observer {

	private Number number;

	public BinaryObserver(Number number) {
		this.number = number;
		this.number.findObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Binary Number : "
				+ Integer.toBinaryString(number.getNumber()));
	}
}
