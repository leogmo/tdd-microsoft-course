package fibonacci.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import fibonacci.Fibonacci;

public class FibonacciTests {

	@Test
	public void fibGiven0Return0() {
		//arrange
		int n = 0;
		
		//act
		int result = Fibonacci.fib(n);
		
		//assert
		assertEquals(0, result);
	}
	
	@Test
	public void fibGiven1Return1() {
		//arrange
		int n = 1;
		
		//act
		int result = Fibonacci.fib(n);
		
		//assert
		assertEquals(1, result);
	}

	@Test
	public void fibGiven2Return1() {
		//arrange
		int n = 2;
		
		//act
		int result = Fibonacci.fib(n);
		
		//assert
		assertEquals(1, result);
	}
	
	@Test
	public void fibGiven3Return2() {
		//arrange
		int n = 3;
		
		//act
		int result = Fibonacci.fib(n);
		
		//assert
		assertEquals(2, result);
	}
	
	@Test
	public void fibGiven4Return3() {
		//arrange
		int n = 4;
		
		//act
		int result = Fibonacci.fib(n);
		
		//assert
		assertEquals(3, result);
	}
}
