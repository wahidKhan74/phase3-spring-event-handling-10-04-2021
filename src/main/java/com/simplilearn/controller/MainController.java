package com.simplilearn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simplilearn.beans.CustomEventPublisher;

@Controller
public class MainController {

	@RequestMapping(value="/customEvent", method=RequestMethod.GET)
	public String customEventMapper(ModelMap map) {
		// get application context 
		ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		
		//trigger a custom event
		CustomEventPublisher publisher = context.getBean("customEventPublisher",CustomEventPublisher.class);
		
		publisher.publish();
		
		return "custom-event";
	}
}
