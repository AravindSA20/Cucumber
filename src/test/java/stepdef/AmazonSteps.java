package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

	public WebDriver driver;
	
	@Given("Open Amazon Application")
	public void open_amazon_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in");
	}

	@When("User captures actual title of Homepage")
	public void user_captures_actual_title_of_homepage() {
	   System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with expected Homepage title")
	public void title_should_be_matched_with_expected_homepage_title() {
	   Assert.assertTrue(driver.getTitle().contains("Online"),"Title is not matched!");
	   System.out.println("HomePage Title is matched!");
	}

	@When("User opens BestSellers page")
	public void user_opens_best_sellers_page() {
	   driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("User captures actual title of BestSellers page")
	public void user_captures_actual_title_of_best_sellers_page() {
		 System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with expected BestSellers title")
	public void title_should_be_matched_with_expected_best_sellers_title() {
		 Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Title is not matched!");
		 System.out.println("BestSellers Title is matched!");
	}

	@When("User opens Mobiles page")
	public void user_opens_mobiles_page() {
		driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User captures actual title of Mobiles page")
	public void user_captures_actual_title_of_mobiles_page() {
		 System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with expected Mobiles title")
	public void title_should_be_matched_with_expected_mobiles_title() {
		 Assert.assertTrue(driver.getTitle().contains("Phones"),"Title is not matched!");
		 System.out.println("Mobiles Title is matched!");
	}

	@When("User opens TodaysDeals page")
	public void user_opens_todays_deals_page() {
		driver.findElement(By.linkText("Today's Deals")).click();
	}

	@When("User captures actual title of TodaysDeals page")
	public void user_captures_actual_title_of_todays_deals_page() {
		 System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with expected TodaysDeals title")
	public void title_should_be_matched_with_expected_todays_deals_title() {
		 Assert.assertTrue(driver.getTitle().contains("Deals"),"Title is not matched!");
		   System.out.println("TodaysDeals Title is matched!");
	}



}
