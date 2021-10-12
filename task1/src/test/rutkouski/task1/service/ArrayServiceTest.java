package test.rutkouski.task1.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.service.impl.ArrayServiceImpl;

public class ArrayServiceTest {
	
	ArrayServiceImpl arrayServiceImpl = new ArrayServiceImpl();
	CustomArray array = new CustomArray(4, -3, 2, 16, 0, -1);

 	@AfterClass
	public void tearDown() {
 		arrayServiceImpl = null;
 		array = null;
 	}
	
	@Test
 	public void changeNegativeToPositiveTest() {
 		CustomArray arrayResult = arrayServiceImpl.changeNegativeToPositive(array);
 		String actual = arrayResult.toString();
 		String expected = "4 3 2 16 0 1 \n";
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void defineAverageValueTest() {
 		double actual = arrayServiceImpl.defineAverageValue(array);
 		double expected = 3;
 		assertEquals(actual, expected, 0.001);
 	}
  	
 	@Test
 	public void defineQuantityOfNegativeTest() {
 		long actual = arrayServiceImpl.defineQuantityOfNegative(array);
 		long expected = 2;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void defineQuantityOfPositiveTest() {
 		long actual = arrayServiceImpl.defineQuantityOfPositive(array);
 		long expected = 3;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void findMaxValueTest() {
 		int actual = arrayServiceImpl.findMaxValue(array);
 		int expected = 16;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void findMinValueTest() {
 		int actual = arrayServiceImpl.findMinValue(array);
 		int expected = -3;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void sumAllTest() {
 		double actual = arrayServiceImpl.sumAll(array);
 		double expected = 18;
 		assertEquals(actual, expected);
 	}
}
