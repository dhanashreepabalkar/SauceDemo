package com.SauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.CartPagePOMClass;
import com.SauceDemo.POMPackage.CheckOutPagePOMClass;
import com.SauceDemo.POMPackage.HomePOMClass;
import com.SauceDemo.POMPackage.LoginPOMClass;
import com.SauceDemo.UtilityPackage.ScreenShotClass;

public class TC08VerifyBuyFunctionality {
	@Test
	public void orderorbuyFunctionality() throws IOException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	 		System.out.println("Browser is opened");
	 		
	 		driver.manage().window().maximize();
	 		System.out.println("Browser is maximised");
	 		
	 		driver.get("https://www.saucedemo.com/");
	 		System.out.println("URL is opened");
	 		
	 		ScreenShotClass.takeScreenshot(driver);
	 		
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 		
	 		//login Activity
	 		LoginPOMClass lp=new LoginPOMClass(driver);  //object of loginpom class
	 		lp.sendUsername();                           // by using object called method of POM class
	 		System.out.println("Username is entered");
	 		
	 		lp.sendPassword();
	 		System.out.println("Password is entered");
	 		
	 		lp.clickLoginButton();
	 		System.out.println("login button is clicked");
	 		System.out.println("land up on home page");
	 		
	 		//add to cart all products
	 		
	 		HomePOMClass hp=new HomePOMClass(driver);     //create object of HomePom class
	 		hp.clickallproducts();
	 		System.out.println("all products added to cart"); 
	 		ScreenShotClass.takeScreenshot(driver);
	 		
	 		hp.clickaddtocart();
	 		System.out.println("all products in cart");
	 		
	 		CartPagePOMClass cp= new CartPagePOMClass(driver);
	 		cp.clickRemoveButton();
	 		System.out.println("one product removed from cart");
	 		
	 		cp.clickcontShopping();
	 		System.out.println("clicked on continue shopping button");
	 		
	 		hp.clickaddtocart();
	 		System.out.println("again clicked on add to cart logo");
	 		
	 		cp.clickcheckoutButton();
	 		System.out.println("proceed for checkout");
	 		
	 		CheckOutPagePOMClass cop=new CheckOutPagePOMClass(driver);  // create object of checkoutpom class
	 		cop.sendFirstName();
	 		System.out.println("First Name-Aarav is entered in address");
	 		
	 		cop.sendLastName();
	 		System.out.println("Last Name-More is entered in address");
	 		
	 		cop.sendPostalCode();
	 		System.out.println("Postal code-411038 is entered in address");
	 		ScreenShotClass.takeScreenshot(driver);
	 		
	 		cop.clickcontitab();
	 		System.out.println("clicked on continue button");
	 		
	 		cop.clickFinishButton();
	 		System.out.println("clicked on finish button");
	 		System.out.println("Checkout : complete & Thank you for your order message is displayed");
	 		ScreenShotClass.takeScreenshot(driver);
	 		
	 		cop.clickBackHome();
	 		System.out.println("clicked on back home tab to land up on HomePage");
	 		
	 		hp.clickSettingButton();
	 		hp.clickLogoutButton();
	 		System.out.println("logout successfully");



	 		
			

		
	}

}
