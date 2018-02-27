package com.TestNGAnnotaions;

import org.testng.annotations.Test;

public class Annotations1 
{
	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to Launch the  Browser");
	}
	
	@Test(priority=2)
	public void LogIN()
	{
		System.out.println("This is used to test LogIn Functionality");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("This is used to test InBox Functionality");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("This is used to test Compose Mail Functionality");
	}
}
