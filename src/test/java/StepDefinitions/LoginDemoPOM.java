package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;


//  public class LoginDemoPOM
//  {
//
//	WebDriver driver=null;
//	LoginPage lp;
//	
//	
//	
//	@Given("User launches browser")
//	public void user_launches_browser() 
//	{
//		System.out.println("=====Login Demo POM =====");
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
//		
//		driver.navigate().to("https://example.testproject.io/web/");	
//	}
//
//	@When("^Enters (.*) and (.*)$")
//	public void enters_username_and_password(String username, String password) throws InterruptedException 
//	{	
//		
//		lp = new LoginPage(driver);
//		
//		lp.enterUsername(username);
//		lp.enterPassword(password);	
//		
//		
//		//driver.findElement(By.id("name")).sendKeys(username); //no
//		//driver.findElement(By.id("password")).sendKeys(password); //no
//		
//		//Thread.sleep(2000);
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() 
//	{
//		lp.clickLogin();
//		//driver.findElement(By.id("login")).click(); //no
//	}
//
//	@Then("User is navigated to home page")
//	public void user_is_navigated_to_home_page() 
//	{
//		lp.checkLogoutIsDisplayed();
//		//driver.findElement(By.id("logout")).isDisplayed(); //no
//		
//		driver.close();
//	}
//
//}