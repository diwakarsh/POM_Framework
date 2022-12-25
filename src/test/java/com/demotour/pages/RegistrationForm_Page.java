package com.demotour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm_Page {

	WebDriver driver;
	public RegistrationForm_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='userName']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='address1']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement postalCode;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//*[contains(text(),'Thank you for registering')]")
	private WebElement registrationText;

	
	public WebElement getFirstName()
	{
		return firstName;
	}

	public WebElement getLastName()
	{
		return lastName;
	}

	public WebElement getPhone()
	{
		return phone;
	}
	
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getAddress()
	{
		return address;
	}
	
	public WebElement getCity()
	{
		return city;
	}
	
	
	public WebElement getState()
	{
		return state;
	}
	
	public WebElement getPostalCode()
	{
		return postalCode;
	}
	
	public WebElement getCountry()
	{
		return country;
	}
	
	public WebElement getUserName()
	{
		return userName;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement getConfirmPassword()
	{
		return confirmPassword;
	}
	
	public WebElement getSubmit()
	{
		return submit;
	}
	
	public WebElement getRegistrationText()
	{
		return registrationText;
	}
	

}
