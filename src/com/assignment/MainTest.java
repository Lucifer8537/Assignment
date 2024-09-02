package com.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main m = new Main();
		assertEquals(0, m.Add(""));
	}

}
