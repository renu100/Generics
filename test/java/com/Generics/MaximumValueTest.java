package com.Generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
	
	MaximumValue max=new MaximumValue();

	@Test
	public void welcome() {
		int value = max.findMax(welcome);
		Assert.assertEquals(9, value);
	}

	}
	
	
	
	
}
