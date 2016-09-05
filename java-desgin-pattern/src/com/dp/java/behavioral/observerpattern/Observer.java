package com.dp.java.behavioral.observerpattern;

import javax.security.auth.Subject;

public abstract class Observer {
	
	protected Subject subject;

	public abstract void update();
}
