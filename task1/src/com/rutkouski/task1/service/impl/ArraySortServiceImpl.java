package com.rutkouski.task1.service.impl;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {

	static Logger logger = LogManager.getLogger();

	@Override
	public void bubleSort(CustomArray array) {

		int[] tempArray = array.getArray();
		int temp;

		for (int i = tempArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tempArray[j] > tempArray[j + 1]) {
					temp = tempArray[j];
					tempArray[j] = tempArray[j + 1];
					tempArray[j + 1] = temp;
				}
			}
		}
		array.setArray(tempArray);
		logger.info("The bubleSorted array: " + tempArray.toString());
	}

	public void arraySortIntStream(CustomArray array) {

		int[] tempArray = Arrays.stream(array.getArray()).sorted().toArray();
		array.setArray(tempArray);
		logger.info("The sorted array (IntStream): " + tempArray.toString());
	}

	@Override
	public void insertionSort(CustomArray array) {

		int[] tempArray = array.getArray();

		for (int i = 1; i < tempArray.length; i++) {
			int current = tempArray[i];
			int j = i - 1;

			while (j >= 0 && current < tempArray[j]) {
				tempArray[j + 1] = tempArray[j];
				j--;
			}
			tempArray[j + 1] = current;
		}
		logger.info("The insertionSorted array: " + tempArray.toString());
	}
}
