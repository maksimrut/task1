package com.rutkouski.task1.service;

import com.rutkouski.task1.entity.CustomArray;

public interface ArrayService {
	
	public int findMinValue(CustomArray array);
	
	public int findMaxValue(CustomArray array);
	
	public double defineAverageValue(CustomArray array);
	
	public double sumAll(CustomArray array);
	
	public int defineQuantityOfPositive(CustomArray array);
	
	public int defineQuantityOfNegative(CustomArray array);
}
