package com.model;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 

@Component
public class PaintingBean {

	private String serviceType;
	private double serviceCost;
	private int area;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}
