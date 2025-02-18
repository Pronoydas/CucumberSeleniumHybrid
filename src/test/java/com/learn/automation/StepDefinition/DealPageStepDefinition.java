package com.learn.automation.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.learn.automation.Pages.LandingPage;
import com.learn.automation.Pages.OfferPage;
import com.learn.automation.Pages.PageObjectManager;
import com.learn.automation.Utilities.TestContextSetup;
import com.learn.automation.Utilities.WebDriverManagerSetup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DealPageStepDefinition {
	WebDriver driver = WebDriverManagerSetup.instanceOfWebDriver().getWebDriver();
	TestContextSetup testContext;
	OfferPage offerPage;
	
	
	public DealPageStepDefinition(TestContextSetup testContext) {
		this.testContext=testContext;
		PageObjectManager pm = new PageObjectManager(driver);
		offerPage=testContext.pom.getOfferPage();	
	}
	
	@Then("^User Search for same Product (.+) in OfferPage$")
	public void userSearchForSameProductInOfferPage(String product) {
		offerPage.searchProduct(product);
		testContext.nameInDealPage=offerPage.getText();
	}
	
	@And("Verify the Product name")
	public void verifyTheProductName() {
		String productName="";
		for(char ch:testContext.actName.toCharArray()) {
		if(Character.isWhitespace(ch)) {
			break;
		}
		productName+=ch;
	}
		Assert.assertEquals(productName, testContext.nameInDealPage);

		
	}
	
//	

//	
}
