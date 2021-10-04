package com.rutkouski.task1.reader;

import java.util.List;

import com.rutkouski.task1.exception.IntArrayException;

public interface LineFileReader {
	
	public List<String> readFileLines(String filePath) throws IntArrayException;

}
