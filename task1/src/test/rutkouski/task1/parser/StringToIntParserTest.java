package test.rutkouski.task1.parser;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rutkouski.task1.exception.IntArrayException;
import com.rutkouski.task1.parser.impl.StringToIntParserImpl;

public class StringToIntParserTest {

	List<String> listStringCorrect = new ArrayList<String>(Arrays.asList("54   -43 25  "));
	List<String> listStringIncorrect = new ArrayList<String>(Arrays.asList("54 rt -43 25 "));
	StringToIntParserImpl stringToIntParserImpl;
	
	@BeforeMethod
	public void setUp() {
		stringToIntParserImpl = new StringToIntParserImpl();
	}	

	@Test (expectedExceptions = IntArrayException.class)
	public void parseToIntTestNullPointerException() throws IntArrayException {
		stringToIntParserImpl.parseToInt(null);
	}
	
	@Test
	public void parseToIntTestIncorrect() throws IntArrayException {
		String actual = stringToIntParserImpl.parseToInt(listStringIncorrect).toString();
		String expected = "[54, -43, 25]";
 		Assert.assertNotEquals(actual, expected);
	}
	
	@Test
	public void parseToIntTestCorrect() throws IntArrayException {
		String actual = stringToIntParserImpl.parseToInt(listStringCorrect).toString();
		String expected = "[54, -43, 25]";
 		assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void tearDown() {
		stringToIntParserImpl = null;
	}
}
