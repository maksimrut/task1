package test.rutkouski.task1.validator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.rutkouski.task1.validator.StringLineValidator;

public class StringLineValidatorTest {

	String str1 = " 1  26     -345  ";
	String str2 = " 24  1.6     -345  ";
	
	@Test
	public void validateIntTestPositive() {
		assertTrue(StringLineValidator.validateInt(str1));
	}
	
	@Test
	public void validateIntTestNegative() {
		assertFalse(StringLineValidator.validateInt(str2));
	}
}
