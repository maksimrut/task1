package com.rutkouski.task1.service.impl;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.service.ArrayService;

public class ArrayServiceStreamImpl implements ArrayService {
	
	static Logger logger = LogManager.getLogger();
	
	@Override
	public int findMinValue(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		int min = Arrays.stream(tempArray).min().getAsInt();
		
		logger.info("The minimum (intStream) value is: " + min);
		return min;
	}

	@Override
	public int findMaxValue(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		int max = Arrays.stream(tempArray).max().getAsInt();
		
		logger.info("The maximum (intStream) value is: " + max);
		return max;
	}

	@Override
	public double defineAverageValue(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		double average = Arrays.stream(tempArray).average().getAsDouble();
		
		logger.info("The average (intStream) value is: " + average);
		return average;
	}

	@Override
	public double sumAll(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		int sum = Arrays.stream(tempArray).sum();
		
		logger.info("The total sum (intStream) is: " + sum);
		return sum;
	}

	@Override
	public long defineQuantityOfPositive(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		long count = Arrays.stream(tempArray).filter(n -> n > 0).count();
		
		logger.info("The positive numbers amount (intStream) is: " + count);
		return count;
	}

	@Override
	public long defineQuantityOfNegative(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		long count = Arrays.stream(tempArray).filter(n -> n < 0).count();
		
		logger.info("The negative numbers amount (intStream) is: " + count);
		return count;
	}
	
	public CustomArray changeNegativeToPositiveIntStream(CustomArray array) {
		
		int[] tempArray = array.getArray();
		
		int[] changedArray = Arrays.stream(tempArray).peek(n -> Math.abs(n)).toArray();
		
		CustomArray customArray = new CustomArray(changedArray);
		logger.info("The changed array (intStream) with not negative numbers: " + customArray.toString());
		return customArray;
	}
}
