package newToursApplicationLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest
{
	
	FirefoxDriver driver;

	@Given("^Open Firefox Browser and navigate to NewTours Application$")
	public void Open_Firefox_Browser_and_navigate_to_NewTours_Application() throws Throwable 
	{
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^User enters Valid UserName and Password and click on SignIn button$")
	public void User_enters_Valid_UserName_and_Password_and_click_on_SignIn_button() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElementByName("password").sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}

	@Then("^User should be able to LogIn Successfully and exit from the Application$")
	public void User_should_be_able_to_LogIn_Successfully_and_exit_from_the_Application() throws Throwable 
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
	
	
	
}
