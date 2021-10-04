package com.simplilearn.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler  implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Context start event recevied !");
	}

}
