package com.rutkouski.task1.validator;

public class StringLineValidator {
	
	private StringLineValidator() {}
	
	private static final String INT_NUMBER_PATTERN = "\\s*-?\\d+(\\s*(-?\\d+))*\\s*";
	
	public static boolean validateInt(String lineOfNumbers) {
		
		return lineOfNumbers != null? lineOfNumbers.matches(INT_NUMBER_PATTERN) : false;
	}
}
