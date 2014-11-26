package com.code_roux.blog.singleton;

public class OnDemandHolder {

	private OnDemandHolder() {
	}

	private static class SingletonHolder {
		private static final OnDemandHolder INSTANCE = new OnDemandHolder();
	}

	public static OnDemandHolder getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
