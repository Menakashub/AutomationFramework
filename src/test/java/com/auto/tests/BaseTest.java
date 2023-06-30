package com.auto.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.auto.driver.Driver;

public class BaseTest {
	protected BaseTest() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	protected void setup() throws IOException {
		Driver.initDriver();
	}
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
		
	}
}
