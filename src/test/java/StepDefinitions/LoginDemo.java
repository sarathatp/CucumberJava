package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
//
//public class LoginDemo {
//	
//	WebDriver driver=null;
//
//	@Given("User launches browser")
//	public void user_launches_browser() 
//	{
//		
//		String driverPath=System.getProperty("user.dir");
//		
//		System.setProperty("webdriver.chrome.driver", driverPath+"/src/test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//	}
//	
//
//	@When("User is on login page")
//	public void user_is_on_login_page() 
//	{
//		driver.navigate().to("https://example.testproject.io/web/");
//		
//		LoginDemoPOM ld=new LoginDemoPOM();
//		
//	}
//
//	@When("^Enters (.*) and (.*)$")
//	public void enters_username_and_password(String username, String password) throws InterruptedException 
//	{
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() 
//	{
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("User is navigated to home page")
//	public void user_is_navigated_to_home_page() 
//	{
//		driver.findElement(By.id("logout"));
//		
//		driver.close();
//	}
//
//}