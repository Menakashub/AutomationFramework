package com.auto.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public  final class ReadPropertyFile {
	private ReadPropertyFile() {
		
	}
	
	public static String getValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		prop.load(file);
		return prop.getProperty(key);
	}

}
