package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import Annotations.calEx;

public class RepeatedTests {
	
	calEx cal;
	
	@BeforeEach
	public void each() {
		
		cal = new calEx();
	}
	
	@Test
	@RepeatedTest(5)
	public void repetedteat1() {
		
		int sum = cal.test(-1000, 20000);
	}
	
	@Test
	@RepeatedTest(value = 3)
	public void repetedteat2() {
		
		int sum = cal.test(-1000, 20000);
	}
	
	@Test
	
	@RepeatedTest(value = 9, name = "{displayName} - repitation - {currentRepetition}/{totalRepetitions}")
	public void Repeatedtests3() {
		
		int sum = cal.test(-1000, 200);
	}
	
	@Test
	@RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME )
	public void repetedteat4() {
		
		int sum = cal.test(-10, 20000);
	}
	
	@Test
	@RepeatedTest(value = 3, name = RepeatedTest.SHORT_DISPLAY_NAME )
	public void repetedteat5() {
		
		int sum = cal.test(-10, 20000);
	}

}
