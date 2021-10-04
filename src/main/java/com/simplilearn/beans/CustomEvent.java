package com.simplilearn.beans;

import org.springframework.context.ApplicationEvent;

//create a custom
public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
	
	public String toString() {
		return "--- This is a custom event ----";
	}
	
}
