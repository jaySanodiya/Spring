package com.spring.DrawShapes;

public class DrawShape {
	Shapes shapes;

	public void setShapes(Shapes shapes) {
		this.shapes = shapes;
	}
	
	public void go() {
		shapes.draw();
		System.out.println("inside draw shape");
	}
	
}
