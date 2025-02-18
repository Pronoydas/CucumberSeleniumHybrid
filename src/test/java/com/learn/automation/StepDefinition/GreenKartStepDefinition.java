package com.learn.automation.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.learn.automation.Pages.LandingPage;
import com.learn.automation.Pages.PageObjectManager;
import com.learn.automation.Utilities.TestContextSetup;
import com.learn.automation.Utilities.WebDriverManagerSetup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKartStepDefinition {
	WebDriver driver = WebDriverManagerSetup.instanceOfWebDriver().getWebDriver();
	TestContextSetup testContext;
	LandingPage landingPage;
	
	
	public GreenKartStepDefinition(TestContextSetup testContext) {
		this.testContext=testContext;
		PageObjectManager pm = new PageObjectManager(driver);
		landingPage=testContext.pom.getLandingPage();
		
	}
	
	
	
	@Given("User is in GreenCart Landing Page")
	public void userIsInGreenCartLandingPage() {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");	
	}
	
	@When("^User Search with products short name (.+)$")
	public void userSearchWithProductsShortName(String productName) {
		landingPage.searchProduct(productName);
		testContext.actName=landingPage.getText();
		landingPage.clickOnLinkAndSwitchWindow();
	}
	
	@And("^Enter The product Qty as (.+) and add to Cart$")
	public void enterTheProductQty(String str) {
		landingPage.enterQty(str);
		landingPage.addToCard();
	}
	
	@When("User Search with products name {string}")
	public void userSearchWithForProduct(String str) {
		landingPage.searchProduct(str);
		
	}
	
	
	@And("Select Cart and Proceed to Checkout")
	public void selectCartAndCheckout() {
		landingPage.proceedToCheckout();
		
	}
	
	
	

}
