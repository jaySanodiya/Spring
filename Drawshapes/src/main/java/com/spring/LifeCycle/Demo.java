package com.spring.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		School sc = ctx.getBean("s",School.class);
		
		sc.period();
		
		((ClassPathXmlApplicationContext)ctx).close();
		// here scope is singleton (by default) thats why we are able to close the method
		// if scope is prototype then close() method will not be working

	}

}
