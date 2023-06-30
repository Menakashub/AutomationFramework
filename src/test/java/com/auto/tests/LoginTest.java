package com.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.auto.driver.Driver;
import com.auto.driver.DriverManager;


public final class LoginTest extends BaseTest{
	private LoginTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void test1() {
		DriverManager.getDr().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
	
}
