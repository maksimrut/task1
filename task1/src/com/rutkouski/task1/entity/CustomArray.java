package com.rutkouski.task1.entity;

import java.util.Arrays;

public class CustomArray {
	
	private int[] array;
	
	public CustomArray() {
	}
	
	public CustomArray(int... array) {
		this.array = array;
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return Arrays.copyOf(array, array.length);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CustomArray other = (CustomArray) obj;
		return Arrays.equals(array, other.array);
	}

	@Override
	public String toString() {
		return "CustomArray [array=" + Arrays.toString(array) + "]";
	}
	
	
	
	
	
	
	

}
