package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginNinjaSteps {
	public WebDriver driver;
	@Given("Open Ninja OpenCart Login page")
	public void open_ninja_open_cart_login_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User enter valid credentials for login")
	public void user_enter_valid_credentials_for_login(DataTable table)    //Crop to DataTable and import DataTable from cucumber
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	   
		List<Map<String,String>> dt=table.asMaps();
		driver.findElement(By.name("email")).sendKeys(dt.get(0).get("email"));    //sendkeys(dt.row1 index0.keyofColumn1)
		driver.findElement(By.name("password")).sendKeys(dt.get(0).get("password"));    //sendkeys(dt.row1 index0.keyofColumn2)
		
	}

	@When("User click Login button from cart page")
	public void user_click_login_button_from_cart_page() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User should be able to login successfully into Open Cart application")
	public void user_should_be_able_to_login_successfully_into_open_cart_application() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("account"),"Login failed!");
	   System.out.println("Login successfully completed!");
	}



}
