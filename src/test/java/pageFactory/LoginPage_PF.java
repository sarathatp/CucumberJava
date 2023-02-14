package pageFactory;

import java.util.List;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class LoginPage_PF 
{

	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;

	@FindBy(id="password")
	@CacheLookup
	WebElement txt_password;
	
	@FindBy(id="login")
	@CacheLookup
	WebElement btn_login;

	@FindBy(tagName="a")
	public List<WebElement> Links;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		
		PageFactory.initElements(factory, this);
	}
		
	public void showAllLinks()
	{

		Iterator<WebElement> loopThrough = Links.iterator();
		
		while(loopThrough.hasNext())
		{
			String aTagLink=loopThrough.next().getText();
			
			System.out.println(aTagLink);
		}
		
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
