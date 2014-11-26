package com.code_roux.blog.singleton;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class OnDemandHolderTest {

	@Test
	public void testSingleton() {
		OnDemandHolder instance = OnDemandHolder.getInstance();
		OnDemandHolder otherInstance = OnDemandHolder.getInstance();
		
		Assertions.assertThat(instance).isSameAs(otherInstance);
	}
}
