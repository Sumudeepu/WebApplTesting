package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.className("gb_P")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedResult="Gmail";
		String ActualResult=driver.getTitle();
		
		System.out.println(ExpectedResult);
		System.out.println(ActualResult);
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched -- FAIL");
		}
		
		driver.close();

	}

}
