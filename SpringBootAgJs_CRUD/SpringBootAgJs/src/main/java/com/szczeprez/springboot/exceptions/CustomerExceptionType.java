package com.szczeprez.springboot.exceptions;

public class CustomerExceptionType extends Exception {

	private String exceptionMessage; 
	
	public CustomerExceptionType(String message) {
		super(message); 
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}	
	
}
