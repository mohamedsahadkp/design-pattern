package com.exp.java.chainofresponsibility;

public class MainChain {

	public static void main(String[] args) {

		// Configure Chain of Responsibility
		Chain c1 = new NegativeProcessor();
		Chain c2 = new ZeroProcessor();
		Chain c3 = new PositiveProcessor();
		c1.setNext(c2);
		c2.setNext(c3);

		// Calling chain of responsibility
		c1.process(new Number(99));
		c1.process(new Number(-30));
		c1.process(new Number(0));
		c1.process(new Number(100));
		
		Number number = new Number();
		number.setNumber(-36);
		c1.process(number);
	}

}