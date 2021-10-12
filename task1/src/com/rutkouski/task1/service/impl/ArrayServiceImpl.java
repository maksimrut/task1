package com.rutkouski.task1.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.service.ArrayService;

public class ArrayServiceImpl implements ArrayService {
	
	static Logger logger = LogManager.getLogger();

	@Override
	public int findMinValue(CustomArray array) {
		
		int[] tempArray = array.getArray();
		int min = tempArray[0];
		
		for (int i = 1; i < tempArray.length; i++) {
			if (tempArray[i] < min) {
				min = tempArray[i];
			}
		}
		logger.info("The minimum value is: " + min);
		return min;
	}
	
	@Override
	public int findMaxValue(CustomArray array) {
		
		int[] tempArray = array.getArray();
		int max = tempArray[0];
		
		for (int i = 1; i < tempArray.length; i++) {
			if (tempArray[i] > max) {
				max = tempArray[i];
			}
		}
		logger.info("The maximum value is: " + max);
		return max;
	}

	@Override
	public double defineAverageValue(CustomArray array) {
		
		int[] tempArray = array.getArray();
		double average = sumAll(array) / tempArray.length;
		logger.info("The average value is: " + average);
		return average;
	}
	
	@Override
	public double sumAll(CustomArray array) {
		
		int[] tempArray = array.getArray();
		int sum = 0;
		
		for (int i = 0; i < tempArray.length; i++) {
			sum += tempArray[i];
		}
		logger.info("The total sum is: " + sum);
		return sum;
	}

	@Override
	public long defineQuantityOfPositive(CustomArray array) {
		
		int[] tempArray = array.getArray();
		long count = 0;
		
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] > 0) {
				count++;
			}
		}
		logger.info("The positive numbers amount is: " + count);
		return count;
	}

	@Override
	public long defineQuantityOfNegative(CustomArray array) {
		
		int[] tempArray = array.getArray();
		long count = 0;
		
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] < 0) {
				count++;
			}
		}
		logger.info("The negative numbers amount is: " + count);
		return count;
	}
	
	public CustomArray changeNegativeToPositive(CustomArray array) {
		
		int[] tempArray = array.getArray();
		int[] changedArray = new int[tempArray.length];
		
		for (int i = 0; i < tempArray.length; i++) {
			changedArray[i] = Math.abs(tempArray[i]);
		}
		
		CustomArray customArray = new CustomArray(changedArray);
		
		logger.info("The changed array with not negative numbers: " + customArray.toString());
		return customArray;
	}
}
