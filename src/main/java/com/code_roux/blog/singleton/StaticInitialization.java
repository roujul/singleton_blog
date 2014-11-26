package com.code_roux.blog.singleton;

public class StaticInitialization {

	private static final StaticInitialization instance;

	static {
		try {
			instance = new StaticInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Error on singleton initialization", e);
		}
	}

	public static StaticInitialization getInstance() {
		return instance;
	}

	private StaticInitialization() {
	}
}
