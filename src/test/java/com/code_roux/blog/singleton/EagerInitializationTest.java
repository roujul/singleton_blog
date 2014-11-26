package com.code_roux.blog.singleton;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class EagerInitializationTest {

	@Test
	public void testSingleton() {
		EagerInitialization instance = EagerInitialization.getInstance();
		EagerInitialization otherInstance = EagerInitialization.getInstance();
		
		Assertions.assertThat(instance).isSameAs(otherInstance);
	}
}
