package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmokeTest {
	
	WebDriver driver;
	WebDriverWait wait;
	

	@Given("^Home page with url \"([^\"]*)\"$")
	public void home_page_with_url(String url) throws Throwable {
	   System.setProperty("webdriver.chrome.driver","chromedriver");
	   driver = new ChromeDriver();
		driver.get(url);
	}

	@When("^home page loaded$")
	public void home_page_loaded() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "WebdriverIO - WebDriver bindings for Node.js");
	    
	}

	@Then("^check all the tabs$")
	public void check_all_the_tabs() throws Throwable {
	   
		Assert.assertEquals(driver.findElement(By.cssSelector(".mainnav:nth-child(2)")).getText(), "Developer Guide");
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}




}
