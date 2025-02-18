package com.learn.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class OfferPage {
	private WebDriver driver ;
	
	
	@FindBy(id = "search-field")
	private WebElement searchBox ;
	
	@FindBy(xpath = "//tbody//tr//td[1]")
	private WebElement productNameDeal;
	
	
	
	 OfferPage(WebDriver driver) {
		this.driver=driver;
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(this.driver, 10);
		PageFactory.initElements(ajax, this);
	}
	 
	 
	 
	 public void searchProduct(String str) {
		 searchBox.sendKeys(str);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	 
	 public String getText() {
			return productNameDeal.getText();
		}
	 
	 
	
	 

}
