package stepsForHooks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksSteps 
{
	WebDriver driver;
	
	@Before("@Smoke")
	public void browserSetup()
	{
		System.out.println("I am inside browserSetup");
		
		String driverPath=System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", driverPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("I am inside tearDown");
		
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("I am inside before step");
	}

	@AfterStep
	public void afterStep()
	{
		System.out.println("I am inside after step");
	}
	
	@Given("user is in login page")
	public void user_is_in_login_page() 
	{

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() 
	{

	}

	@When("clicks on login button")
	public void clicks_on_login_button() 
	{

	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() 
	{

	}



}
