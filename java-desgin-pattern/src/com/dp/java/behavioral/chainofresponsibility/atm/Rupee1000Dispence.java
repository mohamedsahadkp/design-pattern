package com.dp.java.behavioral.chainofresponsibility.atm;

public class Rupee1000Dispence implements DispenseChain {

	private DispenseChain chain;

	public void nextChain(DispenseChain dispenseChain) {
		this.chain = dispenseChain;
	}

	public void processChain(Rupee rupee) {
		if (rupee.getAmount() >= 1000) {
			int count = rupee.getAmount() / 1000;
			int balance = rupee.getAmount() % 1000;

			System.out.println("Printing " + count + " 1000 Rupee");

			if (balance != 0) {
				rupee = new Rupee();
				rupee.setAmount(balance);
				chain.processChain(rupee);
			}
		} else {
			chain.processChain(rupee);
		}
	}
}
