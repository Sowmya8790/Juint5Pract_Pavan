package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Annotations.calEx;

public class Assertionss {
	
calEx cal;
	
	@BeforeEach
	public void each() {
		
		cal = new calEx();
	}
	
	@Test
	public void assert1positive() {
		
		int sum = cal.test(10, 20);
		Assertions.assertEquals(30, sum);
	}
	
	@Test
	public void assert2negative() {
		
		int sum = cal.test(10, 20);
		Assertions.assertEquals(40, sum);
	}
	
	@Test
	public void assert1notequals() {
		
		int sum = cal.test(10, 20);
		Assertions.assertNotEquals(30, sum);
	}
	
	@Test
	public void assert1array() {
		
		
	//	Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	//	Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,3,2});
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3,4});
		
	}
	@Test
	public void assertnull() {
		
		String valu = null;
		String value = "Sowmya";
		
		Assertions.assertNull(valu);
	//	Assertions.assertNull(value);
	}
	
	@Test
	public void assertnotnull() {
		
		String valu = null;
		String value = "Sowmya";
		
	//	Assertions.assertNotNull(valu);
		Assertions.assertNotNull(value);
	}
	
	
	@Test
	public void assert1false() {
		
		boolean truevalue = true;
		boolean falsevalue = false;
		
		
		Assertions.assertTrue(false);
	}

	@Test
	public void assert1true() {
		
		boolean truevalue = true;
		boolean falsevalue = false;
		
		
		Assertions.assertTrue(true);
	}
		

}
