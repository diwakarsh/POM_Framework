package com.demotour.functions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demotour.pages.Home_Page;
import com.demotour.pages.RegistrationForm_Page;

import GUIUtils.Misc;

public class RegistrationFunctions {

	public static void navigateToRegistrationPage(WebDriver driver,ExtentTest reportMessage
			) throws IOException
	{
		Home_Page hp =new Home_Page(driver);
		reportMessage.log(Status.INFO, "Home Page",MediaEntityBuilder.createScreenCaptureFromPath(Misc.captureScreenShot(driver)).build());
		hp.getRegister().click();
		reportMessage.info("Register link was clicked");
		
	}
	
	public static void fillDataInRegistrationForm(WebDriver driver,ExtentTest reportMessage
			,Map<Object,Object>testData) throws IOException
	{
		String firstName=(String) testData.get("FirstName");
		String lastName=(String) testData.get("LastName");
		String phone=(String) testData.get("Phone");
		String email=(String) testData.get("Email");
		String address=(String) testData.get("Address");
		String city=(String) testData.get("City");
		String state=(String) testData.get("State");
		String postalcode=(String) testData.get("PostalCode");
		String country=(String) testData.get("Country");
		String userName=(String) testData.get("UserName");
		String password=(String) testData.get("Password");
		
											
		RegistrationForm_Page rf=new RegistrationForm_Page(driver);
		reportMessage.log(Status.INFO, "Registration Page",
				MediaEntityBuilder.createScreenCaptureFromPath(Misc.captureScreenShot(driver)).build());
		
		rf.getFirstName().sendKeys(firstName);
		reportMessage.info("First Name Was set as "+firstName);
		
		rf.getLastName().sendKeys(lastName);
		reportMessage.info("Last Name Was set as "+lastName);
		
		rf.getPhone().sendKeys(phone);
		reportMessage.info("Phone Was set as "+phone);
		
		rf.getEmail().sendKeys(email);
		reportMessage.info("email Was set as "+email);
		
		rf.getAddress().sendKeys(address);
		reportMessage.info("Address Was set as "+address);
		
		rf.getCity().sendKeys(city);
		reportMessage.info("city Was set as "+city);
		
		rf.getState().sendKeys(state);
		reportMessage.info("state Was set as "+state);
		
		rf.getPostalCode().sendKeys(postalcode);
		reportMessage.info("PostalCode Was set as "+postalcode);
		
		Select comboval=new Select(rf.getCountry());
		comboval.selectByVisibleText(country);
		reportMessage.info("Country Was  set as "+country);
		
		rf.getUserName().sendKeys(userName);
		reportMessage.info("UserName Was set as "+userName);
		
		rf.getPassword().sendKeys(password);
		reportMessage.info("Password was set as "+password);
		
		rf.getConfirmPassword().sendKeys(password);
		reportMessage.info("Confirm Password was  set as "+password);
		
		reportMessage.log(Status.INFO, "Registration Page screenshot after filling the values",
				MediaEntityBuilder.createScreenCaptureFromPath(Misc.captureScreenShot(driver)).build());
		
		rf.getSubmit().click();
		
		Assert.assertTrue(rf.getRegistrationText().isDisplayed());
		reportMessage.pass("Registration sucessfully completed",
				MediaEntityBuilder.createScreenCaptureFromPath(Misc.captureScreenShot(driver)).build());
		
		
	}
}
