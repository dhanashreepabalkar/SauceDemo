package com.SauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;
import com.SauceDemo.POMPackage.LoginPOMClass;
import com.SauceDemo.UtilityPackage.ScreenShotClass;

public class TC04VerifyMultipleProductAddToCartFunctionality {
     @Test
	public void verifyallproducttocart() throws IOException {
    	 
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
 		
 		HomePOMClass hp=new HomePOMClass(driver);   
 		hp.clickallproducts();
 		System.out.println("all products added to cart");
 		ScreenShotClass.takeScreenshot(driver);
		

	}

}
