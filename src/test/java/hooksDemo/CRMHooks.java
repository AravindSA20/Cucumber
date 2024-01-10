package hooksDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks 
{
	/*
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.out.println("Application opens with Browser");
		//driver=new ChromeDriver();
		driver=BrowserSetUp.setDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm");
	}
	
	//this will run Before login scenario
	@Before("@LogIn")    //@LogIn is a tag in feature
	public void beforeLogin()
	{
		driver.findElement(By.linkText("Sign In")).click();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Browser will close");
		driver.quit();
	}
*/
}
