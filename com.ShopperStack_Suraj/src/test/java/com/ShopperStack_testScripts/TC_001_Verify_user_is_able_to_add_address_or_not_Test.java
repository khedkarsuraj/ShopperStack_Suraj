package com.ShopperStack_testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack.GenericUtility.Base_Test;
import com.ShopperStack.POM.AddressForm_Page;
import com.ShopperStack.POM.MyAddress_Page;
import com.ShopperStack.POM.My_ProfilePage;
import com.aventstack.extentreports.Status;

public class TC_001_Verify_user_is_able_to_add_address_or_not_Test extends Base_Test{
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		
	    test=reports.createTest("AddAddress");
	    test.log(Status.PASS, "Login Done Successfully");
	    
	    homePage.getAccountSetting().click();
	    homePage.getMyProfileButton().click();
	    
	    test.log(Status.INFO, "Navigated to My Profile Page");
	    
	    My_ProfilePage myProfilePage= new My_ProfilePage(driver);
	    myProfilePage.getAddress().click();
	    
	    test.log(Status.INFO, "Navigated to My Address Page");
	    
	    MyAddress_Page myAddressPage = new MyAddress_Page(driver);
	    myAddressPage.getAddAddressButton().click();
	    
	    test.log(Status.INFO, "Navigated to My AddressForm Page");
	    
	    AddressForm_Page addressFormPage =new AddressForm_Page(driver);
	    addressFormPage.getOfficeButton().click();
	    
	    addressFormPage.getNameTextField().sendKeys(file.readExcelData("Sheet1", 1, 0));
	    addressFormPage.getHouseTextField().sendKeys(file.readExcelData("sheet1", 1, 1));
	    addressFormPage.getStreetTextField().sendKeys(file.readExcelData("sheet1", 1, 2));
	    addressFormPage.getLandmarkTextField().sendKeys(file.readExcelData("sheet1", 1, 3));
	    
	    
	    webdriverUtility.selectByValue(addressFormPage.getCountryDropdown(), file.readExcelData("sheet1", 1, 4));
	    webdriverUtility.selectByValue(addressFormPage.getStateDropDown(), file.readExcelData("sheet1", 1, 5));
	    webdriverUtility.selectByValue(addressFormPage.getCityDropDown(), file.readExcelData("sheet1", 1, 6));
	    
	    addressFormPage.getPincodeTextField().sendKeys(file.readExcelData("sheet1", 1, 7));
	    addressFormPage.getPhoneNumbertextField().sendKeys(file.readExcelData("sheet1", 1, 8));
	    addressFormPage.getAddAddressButton().click();
	    Thread.sleep(3000);
	    webdriverUtility.takeWebPageScreenShot(); 


		
	}

}
