package com.dp.behavioral.observerpattern;

public class ObserverPatternDemo {

	public static void main(String ar[]) {

		Number number = new Number();

		new BinaryObserver(number);
		new HexaObserver(number);
		new OctalObserver(number);

		number.setNumber(9851);
	}
}
