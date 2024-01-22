package com.utilities;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String url) {
		if(browserName.equals("Chrome")) {
			driver = WebDriverManager.chromedriver().create();
		}
		else if(browserName.equals("Firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
		
	}

}
