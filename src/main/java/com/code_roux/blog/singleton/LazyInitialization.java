package com.code_roux.blog.singleton;

public class LazyInitialization {

	private static LazyInitialization instance = null;

	private LazyInitialization() {
	}

	public static synchronized LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}

		return instance;
	}
}
