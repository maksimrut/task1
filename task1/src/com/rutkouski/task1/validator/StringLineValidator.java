package com.rutkouski.task1.validator;

public class StringLineValidator {
	
	private static final String INT_NUMBER_PATTERN = "^-?\\d+(\\s(-?\\d+))*$";
	
	public final boolean validateInt(String lineOfNumbers) {
		
		return lineOfNumbers != null? lineOfNumbers.matches(INT_NUMBER_PATTERN) : false;
	}
}
