package Tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Annotations.calEx;


public class Beforeandaftertest {

	calEx calculator;
	

	@BeforeAll
	public static void allb() {
		
		System.out.println("brfore all");
	}
	
	@AfterAll
	public static void alla() {
		
		System.out.println("aftre all");
	}
	
	@BeforeEach
	public void cal() {
		calculator = new calEx();
		System.out.println("before method");
	}
	
	@Test
	@DisplayName("this is addition of ")
	public void testmethodone1() {
		
		
		calculator.test(10,-90);
	}
	
	@Test
	@DisplayName("this is addition of two ")
	public void testmethodone2() {
	calculator.test(100,-98);
	}
	
	@AfterEach
	public void cala() {
		
		System.out.println("this after method");
	}
}
