package com.dp.creational.singleton;

public class SinlgeObject {

	private static SinlgeObject object = new SinlgeObject();

	public SinlgeObject() {
		// TODO Auto-generated constructor stub
	}
	
	public static SinlgeObject getInstance() {
		return object;
	}

	public void testMessage() {
		System.out.println("I am here");
	}
}
