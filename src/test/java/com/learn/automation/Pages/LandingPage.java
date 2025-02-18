package com.learn.automation.Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class LandingPage {
	private WebDriver driver ;
	
	@FindBy(className = "search-keyword")
	private WebElement SearchArea ;
	
	@FindBy(css = "h4.product-name")
	private WebElement productName;
	
	@FindBy(linkText = "Top Deals")
	private WebElement topDealsLink;
	
	@FindBy(css = "input.quantity")
	private WebElement qtyField;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement cartButton;
	
	@FindBy(css ="a.cart-icon")
	private WebElement cartIcon;
	
	@FindBy(xpath ="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement checkoutBtn;
	
	
	
	
	LandingPage(WebDriver driver){
		this.driver=driver;
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, this);
	}
	
	
	
	public void searchProduct(String str) {
		SearchArea.sendKeys(str);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getText() {
		return productName.getText();
	}
	
	public void clickOnLinkAndSwitchWindow() {
		topDealsLink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String parentWindow =driver.getWindowHandle();
		for(String str:driver.getWindowHandles()) {
			if(!str.equals(parentWindow)) {
				driver.switchTo().window(str);
			}
		}
	}
	
	
	
	public void enterQty(String qty) {
		qtyField.clear();
		qtyField.sendKeys(qty);
	}
	
	public void addToCard() {
		cartButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void proceedToCheckout() {
		cartIcon.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkoutBtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	

}
