package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.utilities.BrowserFactory;

public class LoginTestHRM {
	
	WebDriver driver;
	@Test
	public void loginApp() {
	
	driver = BrowserFactory.startApplication(driver,"Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println(driver.getTitle());
	
	}
}
