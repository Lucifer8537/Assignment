package com.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MainTest {
	Main m = new Main();
	@Test
	void test() {
		
		assertEquals(0, m.Add(""));
		assertEquals(1, m.Add("1"));
		assertEquals(2, m.Add("2"));
		assertEquals(3, m.Add("3"));
		assertEquals(4, m.Add("4"));
		assertEquals(5, m.Add("5"));
		assertEquals(6, m.Add("6"));
		assertEquals(7, m.Add("7"));
		assertEquals(8, m.Add("8"));
		assertEquals(9, m.Add("9"));
		assertEquals(10, m.Add("10"));
		assertEquals(1, m.Add("0,1"));
		assertEquals(3, m.Add("1,2"));
		assertEquals(6, m.Add("1,2,3"));
		assertEquals(8, m.Add("2,2,2,2"));
		assertEquals(10, m.Add("1, 2, 3, 4"));
		assertEquals(3000000000L, m.Add("1000000000, 2000000000"));
		assertEquals(6, m.Add("1\n2,3"));
		assertEquals(15,m.Add("1\n2,3,4\n5"));
		assertEquals(3, m.Add("//;\n1;2"));
		assertEquals(10, m.Add("//:\n1:2:3:4"));
		assertEquals(10, m.Add("//:\n 1 : 2 : 3 : 4 "));
		assertThrows(NegativeNumberException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				m.Add("-1,2,3");
			}
		});
	}
	

}
