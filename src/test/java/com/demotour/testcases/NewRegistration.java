package com.demotour.testcases;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.demotour.functions.RegistrationFunctions;

import GUIBase.Base;
import GUIUtils.Data_Supplier;

public class NewRegistration extends Base {

	@Test(dataProvider="Data",dataProviderClass = Data_Supplier.class)
	public void Registration(Map<Object,Object> dataMap) throws IOException 
	{
	
		reportMessage=report.createTest("New Registration");
		ExtentTest homePageRpt=reportMessage.createNode("Home Page");
		RegistrationFunctions.navigateToRegistrationPage(driver, homePageRpt);
		
		ExtentTest registrationRpt=reportMessage.createNode("Registration Page");
		RegistrationFunctions.fillDataInRegistrationForm(driver, registrationRpt,dataMap);
		
	}	
	
}
