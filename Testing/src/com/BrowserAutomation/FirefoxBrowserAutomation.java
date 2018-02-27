package com.BrowserAutomation;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowserAutomation {

	public static void main(String[] args) {
		FirefoxDriver Rama = new FirefoxDriver();
		
		Rama.get("http://www.google.com");
		
		Rama.navigate().to("http://www.facebook.com");
		
		Rama.close();
		
	}

}
