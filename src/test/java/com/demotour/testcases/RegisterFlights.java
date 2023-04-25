package com.demotour.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.demotour.functions.FlightsFunctions;


import GUIBase.Base;
import GUIUtils.Data_Supplier;

public class RegisterFlights extends Base{

	@Test(dataProvider="Data",dataProviderClass = Data_Supplier.class)
	public void Flights(Map<Object,Object> dataMap)
	{
		reportMessage=report.createTest("New Registration");
		ExtentTest homePageRpt=reportMessage.createNode("Home Page");
		FlightsFunctions.openFlightPage(driver, homePageRpt);
		
		
	}
}
