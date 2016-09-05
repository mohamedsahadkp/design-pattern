package com.dp.java.behavioral.observerpattern;


public class OctalObserver extends Observer {

	private Number number;

	public OctalObserver(Number number) {
		this.number = number;
		this.number.findObserver(this);

	}

	public void update() {
		System.out.println("Octa Number : "
				+ Integer.toOctalString(number.getNumber()));
	}

}
