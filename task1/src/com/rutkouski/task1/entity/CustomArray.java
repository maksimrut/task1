package com.rutkouski.task1.entity;

import java.util.Arrays;

import com.rutkouski.task1.exception.IntArrayException;

public class CustomArray {

	private int[] array;

	public CustomArray() {
	}

	public CustomArray(int... array) {
		this.array = array;
	}

	public CustomArray(int length) throws IntArrayException {

		if (length < 0) {
			throw new IntArrayException("Array length can not be negative:" + length);
		}
		array = new int[length];
	}

	public int getIntByIndex(int index) throws IntArrayException {
		if (index >= array.length || index < 0) {
			throw new IntArrayException("Out of legal index:" + index);
		}
		return array[index];
	}

	public void setArray(int[] array) {
		this.array = Arrays.copyOf(array, array.length);
	}

	public int[] getArray() {
		return Arrays.copyOf(array, array.length);
	}

	public int getLength() {
		return array.length;
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
		StringBuilder stringBuilder = new StringBuilder();
		for (int i : array) {
			stringBuilder.append(i).append(" ");
		}
		stringBuilder.append("\n");
		return stringBuilder.toString();
	}
}
