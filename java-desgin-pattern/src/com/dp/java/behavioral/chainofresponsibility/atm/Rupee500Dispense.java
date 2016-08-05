package com.dp.java.behavioral.chainofresponsibility.atm;

public class Rupee500Dispense implements DispenseChain {

	private DispenseChain chain;

	public void nextChain(DispenseChain dispenseChain) {
		this.chain = dispenseChain;
	}

	public void processChain(Rupee rupee) {
		if (rupee.getAmount() >= 500) {
			int count = rupee.getAmount() / 500;
			int balance = rupee.getAmount() % 500;

			System.out.println("Printing " + count + " 500 Rupee");
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
