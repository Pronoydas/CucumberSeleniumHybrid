package com.learn.automation.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartPage {
	
	WebDriver driver ;
	
	@FindBy(xpath = "//button[text()='Apply']")
	public WebElement applyBtn;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	public WebElement placeOrderBtn;
	
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, this);
	}
	
	
	

}
