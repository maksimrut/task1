package com.rutkouski.task1.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.rutkouski.task1.exception.ParserException;
import com.rutkouski.task1.parser.StringToIntParser;
import com.rutkouski.task1.validator.StringLineValidator;

public class StringToIntParserImpl implements StringToIntParser {
	
	static Logger logger = LogManager.getLogger();

	@Override
	public List<Integer> parseToInt(List<String> listString) throws ParserException {
	
		StringLineValidator stringLineValidator = new StringLineValidator();
		List<Integer> listInteger = new ArrayList<>();

		if (!listString.isEmpty()) {

			for (String line : listString) {
				if (stringLineValidator.validate(line)) {
					listInteger.add(Integer.parseInt(line));

				} else {
					logger.error("Failed validation");
					throw new ParserException("Failed validation");
				}
			}
		} 
		return listInteger;
	}
}
