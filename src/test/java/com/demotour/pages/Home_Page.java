package com.demotour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//a[text()='REGISTER']")
	private WebElement register;
	
	@FindBy(xpath="//a[text()='SIGN-ON']")
	private WebElement signon;
	
	@FindBy(xpath="//input[@name='userName']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	
	public WebElement getRegister()
	{
		return register;
	}
	public WebElement getSignon()
	{
		return signon;
	}
	public WebElement getUserName()
	{
		return userName;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getSubmit()
	{
		return submit;
	}
}
