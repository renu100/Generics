package com.Generics;

import org.junit.Assert;
import org.junit.Test;

class MaximumValueTestCase {

	// Integer type User input value and find maximum value at first position
	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtFirstPosition() {
		Integer[] arr = { 9, 3, 2, 4, 5, 2 };
		int value = new MaximumValue<Integer>(arr).findMax();
		Assert.assertEquals(9, value);
	}

	// Integer type User input value and find maximum value at second position
	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtSecondPosition() {
		Integer[] arr = { 3, 9, 2, 4, 5, 2 };
		int value = new MaximumValue<Integer>(arr).findMax();
		Assert.assertEquals(9, value);
	}

	// Integer type User input value and find maximum value at third position
	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtThirdPosition() {
		Integer[] arr = { 3, 2, 9, 5, 2 };
		int value = new MaximumValue<Integer>(arr).findMax();
		Assert.assertEquals(9, value);
	}

	// Float type User input value and find maximum value at first position
	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxAtFirstPosition() {
		Float[] arr = { 9.0f, 5.0f, 6.0f };
		float value = new MaximumValue<Float>(arr).findMax();
		Assert.assertEquals(9.0f, value, 0.0f);
	}
	// Float type User input value and find maximum value at second position

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxSecoundPosition() {
		Float[] arr = { 5.0f, 9.0f, 6.0f };
		float value = new MaximumValue<Float>(arr).findMax();
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	// Float type User input value and find maximum value at third position
	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxThirdPosition() {
		Float[] arr = { 9.0f, 5.0f, 11.0f };
		float value = new MaximumValue<Float>(arr).findMax();
		Assert.assertEquals(11.0f, value, 0.0f);
	}

	// String type User input value and find maximum value at first position
	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtFirstPosition() {
		String[] arr = { "peach", "apple", "banana" };
		String value = new MaximumValue<String>(arr).findMax();
		Assert.assertEquals("peach", value);
	}

	// String type User input value and find maximum value at second position
	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtSecoundPosition() {
		String[] arr = { "apple", "peach", "banana" };
		String value = new MaximumValue<String>(arr).findMax();
		Assert.assertEquals("peach", value);
	}

	// String type User input value and find maximum value at third position
	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtThirdPosition() {
		String[] arr = { "apple", "banana", "peach" };
		String value = new MaximumValue<String>(arr).findMax();
		Assert.assertEquals("peach", value);
	}
}