package com.dp.java.behavioral.chainofresponsibility;

public class MainChain {

	public static void main(String[] args) {

		// Configure Chain of Responsibility
		Chain negativeChain = new NegativeProcessor();
		Chain zeroChain = new ZeroProcessor();
		Chain positiveChain = new PositiveProcessor();
		negativeChain.setNext(zeroChain);
		zeroChain.setNext(positiveChain);

		// Calling chain of responsibility
		negativeChain.process(new Number(99));
		negativeChain.process(new Number(-30));
		negativeChain.process(new Number(0));
		negativeChain.process(new Number(100));

		Number number = new Number();
		number.setNumber(-36);
		negativeChain.process(number);
	}

}