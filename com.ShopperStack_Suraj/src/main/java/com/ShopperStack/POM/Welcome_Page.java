package com.ShopperStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
	public Welcome_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "loginBtn")
	
	private WebElement loginButton;


	public WebElement getLoginButton() {
		return loginButton;
	}
}


//to add getter right click -> source-> generate gettersand setters->select -> getter