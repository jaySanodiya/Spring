package com.spring.calci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PresentationLayer presentationLayer = applicationContext.getBean(PresentationLayer.class, "presantationBean");
		System.out.println(presentationLayer.go(20, 10));
		
	}
}
