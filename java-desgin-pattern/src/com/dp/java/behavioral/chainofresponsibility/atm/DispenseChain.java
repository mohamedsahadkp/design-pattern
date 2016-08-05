package com.dp.java.behavioral.chainofresponsibility.atm;

public interface DispenseChain {

	public void nextChain(DispenseChain dispenseChain);

	public void processChain(Rupee rupee);
}
