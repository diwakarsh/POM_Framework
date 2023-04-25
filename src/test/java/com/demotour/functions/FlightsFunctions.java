package com.demotour.functions;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.demotour.pages.Home_Page;

public class FlightsFunctions 
{
	public static void openFlightPage(WebDriver driver,ExtentTest reportMessage) {
		Home_Page hp=new Home_Page(driver);
		hp.getFlights().click();
		reportMessage.info("Flights link was clicked");
		
	}
	
	public static void bookFlight(WebDriver driver,ExtentTest reportMessage) {
		
		
	}
}
