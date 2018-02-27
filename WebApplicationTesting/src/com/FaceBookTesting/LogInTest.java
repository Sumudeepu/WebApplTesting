package com.FaceBookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("rama.ammu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();
		

	}

}
