package com.hascode.tutorial;

public class MyApp {
	public String getId(Long prefix, String suffix) {
		if (prefix == null) {
			throw new NullPointerException("id must not be null");
		}

		if (suffix == null) {
			return prefix + "--ID--(-)";
		}

		return prefix + "--ID--(" + suffix + ")";
	}
}
