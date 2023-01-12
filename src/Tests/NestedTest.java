package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import Annotations.calEx;

public class NestedTest {

	
calEx cal;
	
	@BeforeEach
	public void each() {
		
		cal = new calEx();
	}
	
	@Nested
	class positvenumbers {
		
		@Test
		public void getPOsitivenumber() {
			
			int sum = cal.test(10, 20);
			System.out.println(sum);
		}
	}
	
	
	@Nested
	class negativenumbers {
		
	@Test
	public void getNegativeNumber() {
		
		int sum = cal.test(-10, -5);
		System.out.println(sum);
	}
	}
	
	@Nested
	class zeronumbers {
		
	@Test
	public void getZeroval() {
		int sum = cal.test(5,-5);
		System.out.println(sum);
	}
	@Test
	public void getZerovalue() {
		int sum = cal.test(5,-5);
		System.out.println(sum);
	}
	}
}
