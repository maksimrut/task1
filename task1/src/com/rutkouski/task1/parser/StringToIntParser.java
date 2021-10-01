package com.rutkouski.task1.parser;

import java.util.List;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.exception.ParserException;

public interface StringToIntParser {
	
	public List<Integer> parseToInt(List<String> list) throws ParserException;
}
