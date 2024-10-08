package com.ShopperStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_ProfilePage {
	
	public My_ProfilePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);	
	 
		}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement Address;

	public WebElement getAddress() {
		return Address;
	}
	

}
