package test.rutkouski.task1.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.service.impl.ArrayServiceStreamImpl;

public class ArrayServiceStreamTest {
	
	ArrayServiceStreamImpl arrayServiceStreamImpl = new ArrayServiceStreamImpl();
	CustomArray array = new CustomArray(4, -3, 2, 16, 0, -1);

 	@Test
 	public void changeNegativeToPositiveTest() {
 		CustomArray arrayResult = arrayServiceStreamImpl.changeNegativeToPositiveIntStream(array);
 		String actual = arrayResult.toString();
 		String expected = "4 3 2 16 0 1 \n";
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void defineAverageValueTest() {
 		double actual = arrayServiceStreamImpl.defineAverageValue(array);
 		double expected = 3;
 		assertEquals(actual, expected, 0.001);
 	}
  	
 	@Test
 	public void defineQuantityOfNegativeTest() {
 		long actual = arrayServiceStreamImpl.defineQuantityOfNegative(array);
 		long expected = 2;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void defineQuantityOfPositiveTest() {
 		long actual = arrayServiceStreamImpl.defineQuantityOfPositive(array);
 		long expected = 3;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void findMaxValueTest() {
 		int actual = arrayServiceStreamImpl.findMaxValue(array);
 		int expected = 16;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void findMinValueTest() {
 		int actual = arrayServiceStreamImpl.findMinValue(array);
 		int expected = -3;
 		assertEquals(actual, expected);
 	}

 	@Test
 	public void sumAllTest() {
 		double actual = arrayServiceStreamImpl.sumAll(array);
 		double expected = 18;
 		assertEquals(actual, expected);
 	}
}
