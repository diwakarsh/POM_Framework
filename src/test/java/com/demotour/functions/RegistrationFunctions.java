package com.demotour.functions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demotour.pages.Home_Page;

import GUIUtils.Misc;

public class RegistrationFunctions {

	public static void navigateToRegistrationPage(WebDriver driver,ExtentTest reportMessage
			,Map<Object,Object>testData) throws IOException
	{
		Home_Page hp =new Home_Page(driver);
		reportMessage.log(Status.INFO, "Home Page",MediaEntityBuilder.createScreenCaptureFromPath(Misc.captureScreenShot(driver)).build());
		hp.getRegister().click();
		reportMessage.info("Register link was clicked");
		
	}
}
