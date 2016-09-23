package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getTest() {
		MyInteger s = new MyInteger(9);
		assertTrue(s.getiValue()==9);
		assertFalse(s.getiValue()==10);
	}
	
	@Test
	public void setTest() {
		MyInteger s = new MyInteger(9);
		assertTrue(s.getiValue() == 9);
		s.setiValue(10);
		assertFalse(s.getiValue() == 9);
	}
	
	@Test 
	public void isEvenTesting() {
		MyInteger s = new MyInteger(10);
		assertTrue(s.isEven());
		MyInteger t = new MyInteger(9);
		assertFalse(t.isEven());
	}
	
	@Test
	public void isOddTesting() {
		MyInteger s = new MyInteger(9);
		assertTrue(s.isOdd());
		MyInteger t = new MyInteger(10);
		assertFalse(t.isOdd());
	}
	
	@Test 
	public void isPrimeTesting() {
		MyInteger s = new MyInteger(11);
		assertTrue(s.isPrime());
		MyInteger t = new MyInteger(12);
		assertFalse(t.isPrime());
	}
	
	@Test 
	public void isEvenIntTesting() {
		assertTrue(MyInteger.isEven(10));
		assertFalse(MyInteger.isEven(11));
	}
	
	@Test
	public void isOddIntTesting() {
		assertTrue(MyInteger.isOdd(9));
		assertFalse(MyInteger.isOdd(10));
	}
	
	@Test
	public void isPrimeIntTesting() {
		assertTrue(MyInteger.isPrime(11));
		assertFalse(MyInteger.isPrime(12));
	}
	
	@Test
	public void isEvenMyIntegerTesting() {
		MyInteger s = new MyInteger(4);
		assertTrue(MyInteger.isEven(s));
		MyInteger t = new MyInteger(5);
		assertFalse(MyInteger.isEven(t));
	}
	
	@Test
	public void isOddMyIntegerTesting() {
		MyInteger s = new MyInteger(9);
		assertTrue(MyInteger.isOdd(s));
		MyInteger t = new MyInteger(10);
		assertFalse(MyInteger.isOdd(t));
	}
	
	@Test 
	public void isPrimeMyIntegerTestin() {
		MyInteger s = new MyInteger(11);
		assertTrue(MyInteger.isPrime(s));
		MyInteger t = new MyInteger(12);
		assertFalse(MyInteger.isPrime(t));
	}
	
	@Test
	public void equalsIntTesting() {
		MyInteger s = new MyInteger(12);
		assertTrue(s.equals(12));
		assertFalse(s.equals(13));
	}
	
	@Test
	public void equalsMyIntegerTesting() {
		MyInteger s = new MyInteger(12);
		MyInteger t = new MyInteger(12);
		MyInteger u = new MyInteger(14);
		assertTrue(s.equals(t));
		assertFalse(s.equals(u));
	}
}
