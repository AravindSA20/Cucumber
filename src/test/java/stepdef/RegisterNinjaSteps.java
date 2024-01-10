package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterNinjaSteps {
	public WebDriver driver;
	@Given("Open Register page of OpenCart application")
	public void open_register_page_of_open_cart_application() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("User enter required fields with valid data")
	public void user_enter_required_fields_with_valid_data(DataTable table)   //crop to DataTable and import DataTable from cucumber
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	 
		List<List<String>> dt=table.cells();
		driver.findElement(By.name("firstname")).sendKeys(dt.get(1).get(0));   //sendkeys(dt.row2 index1.column1 index0) - ie., Mitzi
		driver.findElement(By.name("lastname")).sendKeys(dt.get(1).get(1));   //sendkeys(dt.row2 index1.column2 index1) - ie., Chan
		driver.findElement(By.id("input-email")).sendKeys(dt.get(1).get(2));   //sendkeys(dt.row2 index1.column3 index2) - ie., mitzicchan@gmail.com
		driver.findElement(By.id("input-telephone")).sendKeys(dt.get(1).get(3));   //sendkeys(dt.row2 index1.column4 index3) - ie., 9894129931
		driver.findElement(By.id("input-password")).sendKeys(dt.get(1).get(4));   //sendkeys(dt.row2 index1.column5 index4) - ie., messi10
		driver.findElement(By.id("input-confirm")).sendKeys(dt.get(1).get(5));   //sendkeys(dt.row2 index1.column6 index5) - ie., messi10
	}

	@When("User click on the Yes radio button")
	public void user_click_on_the_yes_radio_button() {
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

	@When("User check privacy policy")
	public void user_check_privacy_policy() {
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should be able to register in OpenCart")
	public void user_should_be_able_to_register_in_open_cart() {
	   System.out.println("Registration is completed!");
	}
	
}
