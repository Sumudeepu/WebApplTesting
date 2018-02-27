package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours
{

	//WebElement register=driver.findElement(By.linkText("REGISTER"));
		//register.click();
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
		
	}
	
	
	@FindBy(name="userName")
	WebElement UName;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void LogInTest(String UserName,String Password)
	{
		UName.sendKeys(UserName);
		pwd.sendKeys(Password);
		SignIn.click();
	}
	
}
