package Tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutsTest {

	
	@Test
	@Timeout(5)
	public void TimeoutTest() throws InterruptedException {
		
		Thread.sleep(5000);
		System.out.println("this test is timeout 1");
	}
	
	@Test
	@Timeout(6)
	public void TimeoutTest1() throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(5);
		System.out.println("the test is timout more");
	}
	
	@Test
	@Timeout(5)
	public void TimeoutTest2() throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(6); // The tc exist after 5 sec but the time for tc takes to run is 6 so failed
		System.out.println("the test is timout less");
	}
	
	@Test
	public void TimeoutTest3() {
		
		Assertions.assertTimeout(Duration.ofSeconds(7), () -> delayseonds(5));
	}
	private void delayseonds(int seconds) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(seconds);
	}
}
