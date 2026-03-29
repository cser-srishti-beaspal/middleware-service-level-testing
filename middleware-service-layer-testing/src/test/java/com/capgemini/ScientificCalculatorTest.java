package com.capgemini;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScientificCalculatorTest {
	@Test
	public void mulTestCase1() {
		int actual = ScientificCalculator.multiplication(5,5);
		int expected = 25;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void mulTestCase2() {
		int actual = ScientificCalculator.multiplication(5,5);
		int expected = -25;
		Assert.assertEquals(actual, expected);
	}
}
