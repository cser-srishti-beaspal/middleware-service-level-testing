package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {
	@Test
	public void addTestCase1() {
		int actual = BasicCalculator.add(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
	@Test
	public void addTestCase2() {
		int actual = BasicCalculator.add(5, 5);
		int expected = -10;
		assertEquals(expected, actual);
	}
}
