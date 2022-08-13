package com.SauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass {
	
	private WebDriver driver;
	private Actions act;
	private Select s;
	
	
	@FindBy(xpath="//button[text()='Open Menu']")      
	private WebElement settingButton;                          //setting button
	
	public void clickSettingButton() {
		act.click(settingButton).perform();
	}
	
	@FindBy(xpath="//a[text()='Logout']")                      //logout button
	private WebElement logoutbutton;
	
	public void clickLogoutButton() {
		logoutbutton.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;                              //dropdown
	
	public void clickDropdown() {
		dropdown.click();
		s.selectByVisibleText("Name (Z to A)");
	}
	
	@FindBy(xpath="//a[text()='About']")
	private WebElement about;                                  //about
	                
	public void clickAbout() {
		about.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagtocart;            //one product to cart
	
	public void clickbagtocart() {
		bagtocart.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocartButton;           //add to cart button
	
	public String getTextFromAddToCart() {            //to get text count
		String totalproducts = addtocartButton.getText();
		return totalproducts;
		
	}
	
	public void clickaddtocart() {                   //click on add to cart button
		addtocartButton.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allproducttoCart;
	
	public void clickallproducts()
	{
		for(Object e:allproducttoCart) {
			allproducttoCart.get(0).click();
			
		}
	}
	
	
       
	//constructor
	public HomePOMClass(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
		s=new Select(dropdown);
		
	}
	
}
