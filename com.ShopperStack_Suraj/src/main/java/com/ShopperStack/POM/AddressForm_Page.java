package com.ShopperStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {
	
	public AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Office")
	private WebElement officeButton;
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseTextField;
	  
	@FindBy(id="Street Info")
	private WebElement streetTextField;
	
	@FindBy(id="Landmark")
	private WebElement landmarkTextField;
	
	@FindBy(id="Country")
	private WebElement countryDropdown;
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	
	public WebElement getOfficeButton() {
		return officeButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseTextField() {
		return houseTextField;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getLandmarkTextField() {
		return landmarkTextField;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumbertextField() {
		return phoneNumbertextField;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}

	@FindBy(id="City")
	private WebElement cityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumbertextField;
	
	@FindBy(id="addAddress")
	private WebElement addAddressButton;
	
	
	

}
