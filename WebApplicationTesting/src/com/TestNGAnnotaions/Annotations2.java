package com.TestNGAnnotaions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("This is used to launch Browser and LogIn");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("Thi is used to test InBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is used to test compose Mail functionality");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("This is used to close the Application");
	}
}
