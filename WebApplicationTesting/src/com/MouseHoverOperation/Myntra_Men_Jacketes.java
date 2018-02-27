package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Men_Jacketes {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		WebElement Men=driver.findElement(By.linkText("Men"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Men).perform();
		
		driver.findElement(By.linkText("Jackets")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
