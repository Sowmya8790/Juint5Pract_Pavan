package Tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Annotations.calEx;

//@Disabled("this is not executing")
public class test {
	
	@Test
	//@Disabled("this is not executing")
	@DisplayName("this is addition ")
	public void testmethodone() {
		
		calEx calculator = new calEx();
		calculator.test(10,12);
	}
	@Tag("sanity")
	@Test
	@DisplayName("this is addition of ")
	public void testmethodone1() {
		
		calEx calculator = new calEx();
		calculator.test(10,-90);
	}
	
	@Test
	@DisplayName("this is addition of two ")
	public void testmethodone2() {
		
		calEx calculator = new calEx();
		calculator.test(100,-98);
	}

}
