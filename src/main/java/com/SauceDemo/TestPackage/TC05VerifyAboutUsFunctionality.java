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

public class TC05VerifyAboutUsFunctionality {
	@Test
	public void verifyAboutUs() throws IOException {
		
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
		
		//about us
		HomePOMClass hp=new HomePOMClass(driver);       //object of homePOM class
		hp.clickSettingButton();
		System.out.println("clicked on setting button");
		
		hp.clickAbout();
		System.out.println("clicked on about us functionality");
		
		//validation
		String expectedTitle="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("TC is failed");
		}
		
		driver.navigate().back();
		
		driver.quit();
		
		
	}

}
