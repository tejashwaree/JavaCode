package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class LoginPage {
	WebDriver driver;
	
	public void loginPage(WebDriver ldriver) 
	{
		this.driver = ldriver;
	}
	
	@FindBy(name="username") WebElement usern;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;

	public void loginToCRM(String username,String passw) 
	{
		usern.sendKeys(username);
		pass.sendKeys(passw);
		loginButton.click();
		
	}





}
