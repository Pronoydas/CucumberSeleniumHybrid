package com.learn.automation.Utilities;

import org.openqa.selenium.WebDriver;
import com.learn.automation.Pages.PageObjectManager;

public class TestContextSetup {
	
	public String nameInDealPage= null;
	public String actName =null;
	public PageObjectManager pom ;
	WebDriver driver ;
	
	public TestContextSetup(){
		driver = WebDriverManagerSetup.instanceOfWebDriver().getWebDriver();
		pom = new PageObjectManager(driver);
	}
	
	
	

}
