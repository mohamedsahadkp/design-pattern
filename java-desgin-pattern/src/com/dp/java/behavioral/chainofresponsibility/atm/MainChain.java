package com.dp.java.behavioral.chainofresponsibility.atm;

import java.util.Scanner;

public class MainChain {

	private DispenseChain rupee1000;

	public MainChain() {

		rupee1000 = new Rupee1000Dispence();
		DispenseChain rupee500 = new Rupee500Dispense();
		DispenseChain rupee100 = new Rupee100Dispense();

		rupee1000.nextChain(rupee500);
		rupee500.nextChain(rupee100);
	}

	public static void main(String a[]) {
		MainChain chain = new MainChain();

		while (true) {
			System.out.println("Enter An Amount");
			Scanner scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();

			if (userInput % 100 != 0) {
				System.out.println("Please Enter Multiple of 100");
				continue;
			}
			Rupee rupee = new Rupee();
			rupee.setAmount(userInput);
			chain.rupee1000.processChain(rupee);

			scanner.close();
		}

	}
}
