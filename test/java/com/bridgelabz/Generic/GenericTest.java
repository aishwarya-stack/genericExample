package com.bridgelabz.Generic;

import org.junit.Test;
import org.junit.Assert;


public class GenericTest {
	

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtFirstPosition() {
		int value = new Generics<Integer>(9, 5, 4).findMax();
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtSecondPosition() {
		int value = new Generics<Integer>(5, 9, 6).findMax();
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtThirdPosition() {
		int value = new Generics<Integer>(6, 5, 9).findMax();
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxAtFirstPosition() {
		float value = new Generics<Float>(9.0f, 5.0f, 6.0f).findMax();
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxSecoundPosition() {
		float value = new Generics<Float>(5.0f, 9.0f, 6.0f).findMax();
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxThirdPosition() {
		float value = new Generics<Float>(9.0f, 5.0f, 11.0f).findMax();
		Assert.assertEquals(11.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtFirstPosition() {
		String value = new Generics<String>("peach", "apple", "banana").findMax();
		Assert.assertEquals("peach", value);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtSecoundPosition() {
		String value = new Generics<String>("apple", "peach", "banana").findMax();
		Assert.assertEquals("peach", value);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtThirdPosition() {
		String value = new Generics<String>("apple", "banana", "peach").findMax();
		Assert.assertEquals("peach", value);
	}

}
