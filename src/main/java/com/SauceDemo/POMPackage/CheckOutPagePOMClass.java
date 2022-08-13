package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPagePOMClass {
	
	WebDriver driver;             //global
	
	@FindBy(xpath="//input[@id='first-name']")    //first name
	private WebElement firstname;
	
	public void sendFirstName() {
		firstname.sendKeys("Aarav");
	}
	
	@FindBy(xpath="//input[@id='last-name']")    //last name
	private WebElement lastname;
	
	public void sendLastName() {
		lastname.sendKeys("More");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")  //postal code
	private WebElement postalcode;
	
	public void sendPostalCode() {
		postalcode.sendKeys("411038");
	}

	@FindBy(xpath="//input[@id='continue']")    //continue button
	private WebElement contitab;
	
	public void clickcontitab() {
		contitab.click();
	}
	
	@FindBy(xpath="//button[text()='Finish']")   // finish button
	private WebElement finishButton;
	
	public void clickFinishButton() {
		finishButton.click();
	}
	
	@FindBy(xpath="//button[text()='Back Home']")    //back home button
	private WebElement backhome;
	
	public void clickBackHome() {
		backhome.click();
	}
	
	@FindBy(xpath="//button[@name='cancel']")    //cancel 1
	private WebElement cancel1;
	
	public void clickCancel1() {
		cancel1.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")  //cancel 2
	private WebElement cancel2;
	
	public void clickCancel2() {
		cancel2.click();
	}
	
	public CheckOutPagePOMClass(WebDriver driver)        //constructor
	{
		
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
}
