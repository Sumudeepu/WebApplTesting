package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting
{

	@Test
	public void HomePageTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelComeMercuryTours WMT = PageFactory.initElements(driver, WelComeMercuryTours.class);
		
		WMT.Register();
		driver.navigate().back();
		
		WMT.Support();
		driver.navigate().back();
		
		WMT.LogInTest("tutorial", "tutorial");
		driver.navigate().back();
		
		driver.close();
	}
	
}
