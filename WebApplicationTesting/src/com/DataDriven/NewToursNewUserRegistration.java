package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursNewUserRegistration 
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		
		Sleeper.sleepTightInSeconds(10);
	}
	
	@Test(priority=2)
	public void NewUserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Lakshmi");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("6825444");
		driver.findElement(By.id("userName")).sendKeys("lakshmi@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("HiTEch");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Lakshmiiii");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName="Lakshmiiii";
		System.out.println(ExpectedUserName);
		
		String ActualText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(ActualText);
		
		if(ActualText.contains(ExpectedUserName))
		{
			System.out.println("User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Not Registered Successfully -- FAIL");
		}
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
