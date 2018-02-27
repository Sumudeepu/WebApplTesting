package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowserAutomation {

	public static void main(String[] args)
	{
		/*System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");*/
		
		System.setProperty("webdriver.edge.driver", "c:\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://gmail.com");

	}

}
