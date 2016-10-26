package com.arturnowicki.patterns.e3.data;

public class RequestObject {

	private int requestID;
	private String firstName;
	private String lastName;
	private int age;
	private String password;
	private String passwordHash;
	private Integer optional;

	public RequestObject(String[] parameters) {
		this.requestID = Integer.parseInt(parameters[1]);
		this.firstName = parameters[2];
		this.lastName = parameters[3];
		this.age = Integer.parseInt(parameters[4]);;
		this.password = parameters[5];
		this.passwordHash = parameters[6];
		this.optional = parameters.length > 7 ? Integer.parseInt(parameters[7]) : null;
	}
}
