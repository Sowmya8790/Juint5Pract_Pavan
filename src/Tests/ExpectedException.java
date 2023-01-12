package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpectedException {

	
	@Test
	public void Exp1() {
		Assertions.assertThrows(ArithmeticException.class, () -> divide(1,0));
	}
	
	@Test
	public void Exp2() {
		Assertions.assertThrows(ArithmeticException.class, () -> divide(0,0));
	}
	
	@Test
	public void Exp3() {
		Assertions.assertThrows(ArithmeticException.class, () -> divide(1,1));
	}
	
	@Test
	public void Exp4() {
		
		Assertions.assertThrows(FileNotFoundException.class, () -> readfile());
	}
	
	@Test
	public void Exp5() {
		
		Assertions.assertThrows(IOException.class, () -> readfile());
	}
	
	
	private int divide(int a, int b)
	{
		return a/b;
	}
	
	private void readfile() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("read.xls");
	}
}
