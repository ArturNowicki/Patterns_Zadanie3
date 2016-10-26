package com.arturnowicki.patterns.e3.data;

public class OrderObject {
	private String carType;
	private int id;
	private int timeout; 

	public OrderObject(String[] parameters) {
		this.carType = parameters[1];
		this.timeout = Integer.parseInt(parameters[2]);
		this.id = Integer.parseInt(parameters[3]);
	}
}
