package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//By using * we import every annotations from cucumber
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps
{
	public WebDriver driver;
    public String title;
	
	@Given("Open Google application")
	public void open_google_application() {
	  System.out.println("Google application opens!");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");
	}

	@When("I capture the current page title")
	public void i_capture_the_current_page_title() {
	   System.out.println("Current Page title is captured!");
	   title=driver.getTitle();
	}

	@Then("Title should match with Google")
	public void title_should_match_with_google() {
		Assert.assertTrue(title.contains("Google"),"Title is not matched!");
	   System.out.println("Title is matched!");
	}
	
	@When("I search valid keyword in search box")
	public void i_search_valid_keyword_in_search_box() {
	   driver.findElement(By.id("APjFqb")).sendKeys("Ronaldinho");
	  
	}

	@Then("Google application should display valid result")
	public void google_application_should_display_valid_result() {
		 List<WebElement> ls=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		   System.out.println("Total options are: "+ls.size());
		   for(WebElement i:ls)
		   {
			   System.out.println(i.getText());
		   }
	    
	}

}
