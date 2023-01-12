package Tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Annotations.calEx;

public class AssumptionsTest {
	
	calEx cal;
	
	@BeforeEach
	public void test() {
		
		cal = new calEx();
	}
	@Test
	public void asmefalse() {
		int sum = cal.test(100, -10);
		Assumptions.assumeFalse(true);
		
	}
	@Test
	public void asmetrue() {
		int sum = cal.test(100, -10);
		Assumptions.assumeTrue(true);
		
	}

}
