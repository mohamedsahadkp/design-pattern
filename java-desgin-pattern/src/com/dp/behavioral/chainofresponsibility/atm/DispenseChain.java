package com.dp.behavioral.chainofresponsibility.atm;

public interface DispenseChain {

	public void nextChain(DispenseChain dispenseChain);

	public void processChain(Rupee rupee);
}
