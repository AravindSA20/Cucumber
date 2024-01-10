package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooksDemo.BrowserSetUp;
import hooksDemo.CRMHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps 
{
	public WebDriver driver=BrowserSetUp.getDriver();
	@Given("Open CRM Homepage")
	public void open_crm_homepage() {
//	  driver=new ChromeDriver();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  driver.get("https://automationplayground.com/crm");
	}

	@When("User click on SignIn")
	public void user_click_on_sign_in() {
	   driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("SignIn page should be open")
	public void sign_in_page_should_be_open() {
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Login page is not opened!");
	  System.out.println("Login page successfully opened!");
	}

	@When("User enter valid email {string} and valid password {string}")
	public void user_enter_valid_email_and_valid_password(String email, String pswd) {
		//driver.findElement(By.linkText("Sign In")).click();
		
     	driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(pswd);
	}

	@When("User click on Submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should be able to login and navigate to Customers page")
	public void user_should_be_able_to_login_and_navigate_to_customers_page() {
		 Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login is not completed!");
		  System.out.println("Login successfully completed!");
	}

}
