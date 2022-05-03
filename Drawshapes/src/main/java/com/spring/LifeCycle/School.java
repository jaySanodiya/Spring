package com.spring.LifeCycle;

public class School {
	
	String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("  object is initialize  ");
		System.out.println("Prayer start before the classes...");
	}
	
	public void period() {
		System.out.println("Message is : "+this.message);
		System.out.println("Maths period is started...");
	}
	
	public void destroy() {
		System.out.println("Close all the window of school...");
		System.out.println("  object is destroyed  ");
	}

}
