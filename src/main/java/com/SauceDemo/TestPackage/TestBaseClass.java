package com.SauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMPackage.LoginPOMClass;
import com.SauceDemo.UtilityPackage.ScreenShotClass;

public class TestBaseClass {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException {
		
		if(browserName.equals("chrome"))
		{

		System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");
			driver = new FirefoxDriver();
		}
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
		
		ScreenShotClass.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Browser is closed");
	}

}
