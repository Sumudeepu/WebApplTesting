package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_DisplayingHeaderLinkNames {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		for(int a=0;a<HeaderBlockLinks.size();a++)
		{
			String HeaderBlockLinkName=HeaderBlockLinks.get(a).getText();
			System.out.println(a+"  "+HeaderBlockLinkName);
		}
		driver.close();

	}

}
