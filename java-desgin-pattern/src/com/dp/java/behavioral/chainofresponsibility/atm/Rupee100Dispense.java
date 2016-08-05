package com.dp.java.behavioral.chainofresponsibility.atm;

public class Rupee100Dispense implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void nextChain(DispenseChain dispenseChain) {
		this.chain = dispenseChain;
	}

	@Override
	public void processChain(Rupee rupee) {
		if (rupee.getAmount() >= 100) {
			int count = rupee.getAmount() / 100;
			int balance = rupee.getAmount() % 100;
			System.out.println("Printing " + count + " 100 Rupee");

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
