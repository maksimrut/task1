package com.rutkouski.task1.exception;

public class IntArrayException extends Exception {

	public IntArrayException() {
		super();
	}

	public IntArrayException(String message, Exception e) {
		super(message, e);
	}

	public IntArrayException(String message) {
		super(message);
	}

	public IntArrayException(Exception e) {
		super(e);
	}
}
