package com.rutkouski.task1.parser.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.exception.IntArrayException;
import com.rutkouski.task1.parser.StringToIntParser;
import com.rutkouski.task1.validator.StringLineValidator;

public class StringToIntParserImpl implements StringToIntParser {
	
	static Logger logger = LogManager.getLogger();

	public static final String DELIMITER_PATTERN = "\\s+";
	
	@Override
	public List<Integer> parseToInt(List<String> listString) throws IntArrayException {
		
		if (listString == null) {
			logger.error("Strings list for parsing is null");
			throw new IntArrayException("Strings list for parsing is null");
		}
	
		List<Integer> listInteger = new ArrayList<>();
		
		listString.stream().filter(s -> !listString.isEmpty())
					.filter(s -> StringLineValidator.validateInt(s))
					.flatMap(line -> Arrays.stream(line.split(DELIMITER_PATTERN)))
					.forEach(lexeme -> listInteger.add(Integer.parseInt(lexeme)));
			
		return listInteger;
	}
}
