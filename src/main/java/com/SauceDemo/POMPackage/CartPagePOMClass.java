package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass {
	
	WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Remove'])[1]")
	private WebElement removeButton;
	
	public void clickRemoveButton() {
		removeButton.click();
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutButton;
	
	public void clickcheckoutButton() {
		checkoutButton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement contShopping;
	
	public void clickcontShopping() {
		contShopping.click();
	}
	
	//constructor
	public CartPagePOMClass(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
