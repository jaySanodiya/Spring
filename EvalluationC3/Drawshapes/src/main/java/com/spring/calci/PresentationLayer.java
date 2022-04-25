package com.spring.calci;

public class PresentationLayer {
	ServiceLayer serviceLayer;

	public PresentationLayer(ServiceLayer serviceLayer) {
	
		this.serviceLayer = serviceLayer;
	}
	
	public int go(int a, int b) {
		return serviceLayer.calculate(a, b);
	}
	
}
