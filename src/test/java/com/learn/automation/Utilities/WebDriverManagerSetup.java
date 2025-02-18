package com.learn.automation.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetup {
	private WebDriver driver ;
	public static WebDriverManagerSetup driverManager;
	

	WebDriverManagerSetup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	public static WebDriverManagerSetup instanceOfWebDriver() {
		if(driverManager == null) {
			driverManager= new WebDriverManagerSetup();
		}
		return driverManager;
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	
	

}
