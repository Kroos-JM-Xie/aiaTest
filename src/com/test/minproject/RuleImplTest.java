package com.test.minproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.aia.minproject.*;
public class RuleImplTest {
	private IRule rules;

	@Before
	public void setUp() throws Exception {
		rules=new RuleImpl();
		
	}

	@Test
	public void test() {
		assertEquals("Fizz", rules.sayRule(100));	
	}
	
}
