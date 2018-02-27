package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation {

	public static void main(String[] args)
	{
		
		FirefoxDriver Lakshmi = new FirefoxDriver();
		Lakshmi.get("http://www.google.com");
		
		Lakshmi.navigate().to("http://facebook.com");
		
		//Lakshmi.close();

	}

}
