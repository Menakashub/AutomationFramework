package com.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.auto.driver.Driver;
import com.auto.driver.DriverManager;

public final class HomePageTest extends BaseTest{
	private HomePageTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void test2() {
		DriverManager.getDr().findElement(By.name("q")).sendKeys("Sun",Keys.ENTER);
	}
	@Test
	public void test3() {
		DriverManager.getDr().findElement(By.name("q")).sendKeys("moon",Keys.ENTER);
	}

}
