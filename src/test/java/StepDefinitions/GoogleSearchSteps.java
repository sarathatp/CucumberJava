package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps 
{

	WebDriver driver=null;
	
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() 
//	{
//		
//		
//		System.out.println("Inside step - browser is open");
//		
//		
//		String projectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() 
//	{
//		System.out.println("Inside step - user is on google search page");
//		
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() 
//	{
//		System.out.println("Inside step - user enters a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("step by step automation ");
//	}
//
//	@And("hits enter")
//	public void hits_enter() 
//	{
//		System.out.println("Inside step - hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() 
//	{
//		System.out.println("Inside step - user is navigated to search results");
//		
//		driver.getPageSource().contains("Online Courses");
//		
//		driver.close();
//	}

}
