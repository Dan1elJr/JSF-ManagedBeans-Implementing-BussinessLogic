package com.sandaniel.jsf.beandemo;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class CounterTwo {
	
	private int value;
	
	public CounterTwo() {}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public void increment() {
		
		value++;
		
	}
	
}
