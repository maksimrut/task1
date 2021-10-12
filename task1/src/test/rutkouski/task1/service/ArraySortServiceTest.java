package test.rutkouski.task1.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rutkouski.task1.entity.CustomArray;
import com.rutkouski.task1.service.impl.ArraySortServiceImpl;

public class ArraySortServiceTest {
	
	CustomArray array;
	ArraySortServiceImpl arraySortServiceImpl = new ArraySortServiceImpl();
	
	@BeforeMethod
	public void setUp() {
		array = new CustomArray(4, -3, 2, 16, 0, -1);
	}
	
	@AfterClass
	public void tearDown() {
		arraySortServiceImpl = null;
 		array = null;
 	}

	@Test
	public void arraySortIntStreamTest() {
		arraySortServiceImpl.arraySortIntStream(array);
		String actual = array.toString();
 		String expected = "-3 -1 0 2 4 16 \n";
 		assertEquals(actual, expected);
	}

	@Test
	public void bubleSortTest() {
		arraySortServiceImpl.bubleSort(array);
		String actual = array.toString();
 		String expected = "-3 -1 0 2 4 16 \n";
 		assertEquals(actual, expected);
	}

	@Test
	public void insertionSortTest() {
		arraySortServiceImpl.insertionSort(array);
		String actual = array.toString();
 		String expected = "-3 -1 0 2 4 16 \n";
 		assertEquals(actual, expected);
	}
	
	@Test
	public void selectionSortTest() {
		arraySortServiceImpl.selectionSort(array);
		String actual = array.toString();
 		String expected = "-3 -1 0 2 4 16 \n";
 		assertEquals(actual, expected);
	}
}
