package com.code_roux.blog.singleton;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class StaticInitializationTest {

	@Test
	public void testSingleton() {
		StaticInitialization instance = StaticInitialization.getInstance();
		StaticInitialization otherInstance = StaticInitialization.getInstance();
		
		Assertions.assertThat(instance).isSameAs(otherInstance);
	}
}
