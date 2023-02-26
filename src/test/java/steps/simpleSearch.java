package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleSearch {
	
	public WebDriver driver;
	
	@Given("I am on the google hompage")
	public void i_am_on_the_google_hompage() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	    
	}

	@When("I enter the {string}")
	public void i_enter_the(String string) {
	    
		
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
	    
		
	}

	@Then("I see the related search results succesfully")
	public void i_see_the_related_search_results_succesfully() {
	    
		
	}
	
	
}
