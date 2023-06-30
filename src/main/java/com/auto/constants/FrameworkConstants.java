package com.auto.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {
		// I dont want anyone to create object for this class in any other class. so declared a private constructor
	}
	private static final String CHROMEPATH =System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

	public static String getChromepath() {
		return CHROMEPATH;
	}

	

}
