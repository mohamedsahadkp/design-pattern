package com.dp.creational.singleton;

/*
 *It is a creational pattern
 * 
 * This pattern involves a single class which is responsible to create an object while 
 * making sure that only single object gets created. This class provides a way to access 
 * its only object which can be accessed directly without need to instantiate the object of 
 * the class.
 * */

public class SingletonPatternDemo {

	public static void main(String a[]) {
		SinlgeObject obj = SinlgeObject.getInstance();
		obj.testMessage();
	}
}
