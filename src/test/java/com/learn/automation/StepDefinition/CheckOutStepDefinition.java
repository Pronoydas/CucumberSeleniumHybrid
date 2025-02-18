package com.learn.automation.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.learn.automation.Pages.CartPage;
import com.learn.automation.Pages.LandingPage;
import com.learn.automation.Pages.PageObjectManager;
import com.learn.automation.Utilities.TestContextSetup;
import com.learn.automation.Utilities.WebDriverManagerSetup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckOutStepDefinition {
	WebDriver drievr =WebDriverManagerSetup.instanceOfWebDriver().getWebDriver();
	TestContextSetup testContextSetup;
	PageObjectManager pom ;
	CartPage op ;
	
	
	public CheckOutStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		pom = new PageObjectManager(drievr);
		op =pom.getCartpage();
	}
	
	
	@Then("Verify Apply and place Order buttons presence")
	public void verifyApplyBtn() {
		Assert.assertTrue(op.applyBtn.isDisplayed());
		Assert.assertTrue(op.placeOrderBtn.isDisplayed());
		
	}
	
	
	
	
	
	
	

}
