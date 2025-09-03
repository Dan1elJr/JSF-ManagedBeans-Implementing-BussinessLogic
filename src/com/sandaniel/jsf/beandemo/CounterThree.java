package com.sandaniel.jsf.beandemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterThree {
	
	private int value;
	
	public CounterThree() {}
	
	
	public int getValue() {
		
		return value;
	}
	
	public void setValue(int value) {
		
		this.value = value;
	}
	
	public String incrementValue() {
		
		value++;
		
		return "counter_three";
	}

}
