package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Gmail {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String ExpectedResult="Gmail Application"; // Client
		System.out.println(ExpectedResult);
		
		String ActualResult=driver.getTitle(); // Developer Developed Title
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
