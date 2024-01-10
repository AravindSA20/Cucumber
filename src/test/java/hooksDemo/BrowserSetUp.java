package hooksDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp {
	// This class is written to overcome nullpointerexception
	
	public static WebDriver driver;
	
	//WebDriver type variable which is created with help of ThreadLocal
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver()
	{
		//Initialize driver
		driver=new ChromeDriver();
		tdriver.set(driver);
		return driver;
	}

	//Thread is a process in Java
}
