package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {
	public WebDriver driver;
	@Given("Open OrangeHRM application")
	public void open_orange_hrm_application()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters username {string} and enters password {string}")
	public void user_enters_username_and_enters_password(String un, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);	
	}

	@When("User clicks on Login button ftom Login pannel")
	public void user_clicks_on_login_button_ftom_login_pannel() 
	{
	    driver.findElement(By.className("oxd-button")).click();
	}

	@Then("User should be able to login and navigate to Dashboard page")
	public void user_should_be_able_to_login_and_navigate_to_dashboard_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login not completed!");
		System.out.println("Login Completed!");
	}




}
