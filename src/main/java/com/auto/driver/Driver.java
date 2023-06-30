package com.auto.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.auto.constants.FrameworkConstants;
import com.auto.util.ReadPropertyFile;

public final class Driver {
	
	private Driver() {
		
	}
	
	public static void initDriver() throws IOException {
		if(Objects.isNull(DriverManager.getDr())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromepath());
			WebDriver driver = new ChromeDriver();
			DriverManager.setDr(driver);
			DriverManager.getDr().get(ReadPropertyFile.getValue("url"));
		}
	}
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDr())) {
			DriverManager.getDr().quit();
			DriverManager.unload(); 
		}
	}
}
