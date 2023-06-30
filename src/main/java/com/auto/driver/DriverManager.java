package com.auto.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	private DriverManager() {
		
	}
private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	
	public static WebDriver getDr() {
		return dr.get();
	}
	public static void setDr(WebDriver driverref) {
		dr.set(driverref);
	}
	public static void unload() {
		dr.remove();//this will remove object dr after all the operation
	}
}
