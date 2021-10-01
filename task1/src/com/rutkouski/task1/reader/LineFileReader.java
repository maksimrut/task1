package com.rutkouski.task1.reader;

import java.util.List;

import com.rutkouski.task1.exception.ReaderException;

public interface LineFileReader {
	
	public List<String> readFileLines(String filePath) throws ReaderException;

}
