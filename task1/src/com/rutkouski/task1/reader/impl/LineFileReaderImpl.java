package com.rutkouski.task1.reader.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.exception.IntArrayException;
import com.rutkouski.task1.reader.LineFileReader;

public class LineFileReaderImpl implements LineFileReader {
	
	static Logger logger = LogManager.getLogger();

	@Override
	public List<String> readFileLines(String filePath) throws IntArrayException {
		
		if (filePath == null || Files.notExists(Paths.get(filePath)) 
				|| filePath.length() == 0) {
			logger.error("File is not found ");
			throw new IntArrayException("File is not found");
		}

		List<String> stringLines;
		try {
			stringLines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
			
		} catch (IOException e) {
			logger.error("Failed or interrupted I/O operations ", e);
			throw new IntArrayException("Failed or interrupted I/O operations", e);
		}
		return stringLines;
	}
}
