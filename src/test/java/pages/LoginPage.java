package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	public By txt_username = By.id("name");
	public By txt_password = By.id("password");
	public By btn_login = By.id("login");
	public By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		if(!driver.getTitle().equals("TestProject Demo"))
		{
			throw new IllegalStateException("This is not login page. Current page is "+driver.getCurrentUrl());
		}
	}
	
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutIsDisplayed()
	{
		driver.findElement(btn_logout).isDisplayed();
	}
	
}


