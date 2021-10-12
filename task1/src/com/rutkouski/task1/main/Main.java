package com.rutkouski.task1.main;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.creator.ArrayCreator;
import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.exception.IntArrayException;
import com.rutkouski.task1.parser.impl.StringToIntParserImpl;
import com.rutkouski.task1.reader.impl.LineFileReaderImpl;
import com.rutkouski.task1.service.impl.ArrayServiceImpl;
import com.rutkouski.task1.service.impl.ArraySortServiceImpl;

public class Main {
	
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		
		String filePath = "files\\file.txt";
		
		LineFileReaderImpl lineFileReaderImpl = new LineFileReaderImpl();
		StringToIntParserImpl stringToIntParserImpl = new StringToIntParserImpl();
		ArrayCreator creator = new ArrayCreator();
		ArrayServiceImpl arrayServiceImpl = new ArrayServiceImpl();
		ArraySortServiceImpl arraySortServiceImpl = new ArraySortServiceImpl();
		
		try {
			List<String> listLines = lineFileReaderImpl.readFileLines(filePath);
			List<Integer> listInteger = stringToIntParserImpl.parseToInt(listLines);
			CustomArray customArray = creator.createCustomArray(listInteger);
			
			arraySortServiceImpl.bubleSort(customArray);
			arrayServiceImpl.changeNegativeToPositive(customArray);
			arrayServiceImpl.findMaxValue(customArray);
			
		} catch (IntArrayException e) {
			logger.error("IntArrayException", e);
		} 
	}
}
