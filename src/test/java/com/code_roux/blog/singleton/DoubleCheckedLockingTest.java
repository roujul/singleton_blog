package com.code_roux.blog.singleton;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class DoubleCheckedLockingTest {

	@Test
	public void testSingleton() {
		DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
		DoubleCheckedLocking otherInstance = DoubleCheckedLocking.getInstance();
		
		Assertions.assertThat(instance).isSameAs(otherInstance);
	}
}
