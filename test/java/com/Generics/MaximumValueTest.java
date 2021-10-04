package com.Generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
MaximumValue max=new MaximumValue();
	
	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtFirstPosition() {
		int value = max.findMax(9, 5, 6);
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtSecondPosition() {
		int value = max.findMax(5, 9, 6);
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtThirdPosition() {
		int value = max.findMax(6, 5, 9);
		Assert.assertEquals(9, value);
	}

	
}
	
	
	
	

