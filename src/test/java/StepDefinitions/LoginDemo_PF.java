package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.HomePage_PF;

import pageFactory.LoginPage_PF;
//
public class LoginDemo_PF {
	
	WebDriver driver=null;
	
	LoginPage_PF login;
	HomePage_PF home;

	@Given("User launches browser")
	public void user_launches_browser() 
	{
		
		String driverPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", driverPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	

	@When("User is on login page")
	public void user_is_on_login_page() 
	{
		driver.navigate().to("https://example.testproject.io/web/");
		login=new LoginPage_PF(driver);
		
		//login.showAllLinks(); //no
			
	}

	@When("^Enters (.*) and (.*)$")
	public void enters_username_and_password(String username, String password) throws InterruptedException 
	{
		
		
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		
////     	driver.findElement(By.id("name")).sendKeys(username); //no
////		driver.findElement(By.id("password")).sendKeys(password); //no
////		
		Thread.sleep(2000);
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException 
	{
		
		login.clickLogin();
		Thread.sleep(2000);
		//driver.findElement(By.id("login")).click(); //no
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() 
	{
		
		home=new HomePage_PF(driver); 
		home.checkLogoutIsDisplayed();
		
		//driver.findElement(By.id("logout")); //no
		
		driver.close();
	}

}