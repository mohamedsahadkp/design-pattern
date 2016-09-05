package com.dp.java.behavioral.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Number {

	private List<Observer> list = new ArrayList<Observer>();

	private Integer number;

	public void setNumber(Integer number) {
		this.number = number;
		notifyAllObserver();
	}

	public Integer getNumber() {
		return this.number;
	}

	public void findObserver(Observer observer) {
		list.add(observer);
	}

	public void notifyAllObserver() {
		for (Observer observer : list) {
			observer.update();
		}
	}
}
