package test.rutkouski.task1.reader;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rutkouski.task1.exception.IntArrayException;
import com.rutkouski.task1.reader.impl.LineFileReaderImpl;

public class LineFileReaderTest {
	
	LineFileReaderImpl lineFileReaderImpl;
	String noExistingFilePath = "filesTest\\test3.txt";
	String correctFilePath = "filesTest\\test1.txt";
	
	@BeforeMethod
	public void setUp() {
		lineFileReaderImpl = new LineFileReaderImpl();
	}	

	@Test (expectedExceptions = IntArrayException.class)
	public void readFileLinesTestNullPointerException() throws IntArrayException {
		lineFileReaderImpl.readFileLines(null);
	}
	
	@Test (expectedExceptions = IntArrayException.class)
	public void readFileLinesTestFileNotExists() throws IntArrayException {
		lineFileReaderImpl.readFileLines(noExistingFilePath);
	}
	
	@Test
	public void readFileLinesTestCorrect() throws IntArrayException {
		String actual = lineFileReaderImpl.readFileLines(correctFilePath).toString();
		String expected = "[5443nr 43]";
 		assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void tearDown() {
		lineFileReaderImpl = null;
	}
}
