package com.rutkouski.task1.service;

import com.rutkouski.task1.entity.CustomArray;

public interface ArraySortService {
	
	public void bubleSort(CustomArray array);
	
	public void insertionSort(CustomArray array);
	
	public void selectionSort(CustomArray array);
}
