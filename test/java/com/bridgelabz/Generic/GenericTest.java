package com.bridgelabz.Generic;




import org.junit.Test;

import junit.framework.Assert;

public class GenericTest  
{
Generics max=new Generics();
	
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

@Test
public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxAtFirstPosition() {
	float value = max.findMax(9.0f, 5.0f, 6.0f);
	Assert.assertEquals(9.0f, value, 0.0f);
}

@Test
public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxSecoundPosition() {
	float value = max.findMax(5.0f, 9.0f, 6.0f);
	Assert.assertEquals(9.0f, value, 0.0f);
}

@Test
public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxThirdPosition() {
	float value = max.findMax(9.0f, 5.0f, 11.0f);
	Assert.assertEquals(11.0f, value, 0.0f);
}


 
}
