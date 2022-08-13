package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	
	private WebDriver driver;  //1.global variable
	
	@FindBy(xpath="//input[@id='user-name']")   //2.username webelement
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");     //3.action on username
	}
	
	@FindBy(xpath="//input[@id='password']")    //password webelemet
	private WebElement password;
	
	public void sendPassword() {
		password.sendKeys("secret_sauce");      //action on password
	}
	
	@FindBy(xpath="//input[@id='login-button']")   //login webelement
	private WebElement loginButton;
	
	public void clickLoginButton() {
		loginButton.click();                       // action on login
	}
	
	//4.constructor of class
	
	public LoginPOMClass(WebDriver driver)  //local
	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
