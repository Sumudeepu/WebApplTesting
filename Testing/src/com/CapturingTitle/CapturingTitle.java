package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle {

	public static void main(String[] args) {
		
		FirefoxDriver rama= new FirefoxDriver();
		rama.get("http://www.google.com");
		
		System.out.println(rama.getTitle());
		rama.close();
		
		
	}

}
