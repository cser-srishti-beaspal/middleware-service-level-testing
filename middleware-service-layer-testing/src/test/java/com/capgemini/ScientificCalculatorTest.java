package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScientificCalculatorTest {
	@Test
	
	public void mulTest() {
		int actual = ScientificCalculator.multiplication(5,5);
		int expected = 25;
		Assert.assertEquals(actual, expected);
	}
}
