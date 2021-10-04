package com.rutkouski.task1.creator;

import java.util.List;

import com.rutkouski.task1.entity.CustomArray;

public class ArrayCreator {
	
	public CustomArray createCustomArray(List<Integer> listInteger) {
		
		int[] array = new int[listInteger.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = listInteger.get(i);
		}
		return new CustomArray(array);
	}
}
