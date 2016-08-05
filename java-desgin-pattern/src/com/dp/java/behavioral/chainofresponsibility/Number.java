package com.dp.java.behavioral.chainofresponsibility;

public class Number {
	
	private int number;

	public Number(){
		
	}
	
	public Number(int number) {
		this.setNumber(number);
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}