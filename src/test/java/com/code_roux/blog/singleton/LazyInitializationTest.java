package com.code_roux.blog.singleton;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class LazyInitializationTest {

	@Test
	public void testSingleton() {
		LazyInitialization instance = LazyInitialization.getInstance();
		LazyInitialization otherInstance = LazyInitialization.getInstance();
		
		Assertions.assertThat(instance).isSameAs(otherInstance);
	}
}
