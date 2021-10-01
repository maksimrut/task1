package com.rutkouski.task1.reader.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.task1.exception.ReaderException;
import com.rutkouski.task1.reader.LineFileReader;

public class LineFileReaderImpl implements LineFileReader {
	
	static Logger logger = LogManager.getLogger();

	@Override
	public List<String> readFileLines(String filePath) throws ReaderException {
		
		ArrayList<String> stringFileLines = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			
			String line;
			while ((line = reader.readLine()) != null) {
				stringFileLines.add(line);
			}
			
		} catch (FileNotFoundException e) {
			logger.error("File is not found ", e);
			throw new ReaderException("File is not found" + filePath, e);
			
		} catch (IOException e) {
			logger.error("Failed or interrupted I/O operations ", e);
			throw new ReaderException("Failed or interrupted I/O operations", e);
		}
		return stringFileLines;
	}
}
