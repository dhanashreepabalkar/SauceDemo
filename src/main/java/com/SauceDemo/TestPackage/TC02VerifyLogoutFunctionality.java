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

public class TC02VerifyLogoutFunctionality {

          @Test
          public void verifyLogout() throws IOException
            {
        	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
      		WebDriver driver = new ChromeDriver();
      		System.out.println("Browser is opened");
      		
      		driver.manage().window().maximize();
      		System.out.println("Browser is maximised");
      		
      		driver.get("https://www.saucedemo.com/");
      		System.out.println("URL is opened");
      		
    		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

      		
      		ScreenShotClass.takeScreenshot(driver);
      		
      		LoginPOMClass lp =new LoginPOMClass(driver);  //created object of LOGINPOM class
      		lp.sendUsername();
      		System.out.println("username entered");
      		
      		lp.sendPassword();
      		System.out.println("password entered");
      		
      		lp.clickLoginButton();
      		System.out.println("login button clicked and land up on homepage");
      		
      		HomePOMClass hp= new HomePOMClass(driver);  //created object of HOMEPOM class
      		hp.clickSettingButton();
      		System.out.println("clicked on setting button");
      		
      		hp.clickLogoutButton();
      		System.out.println("clicked on logout and land up on login page again");
      		
      		//validation
      		
      		String expectedTitle="Swag Labs";    //given in requirements
    		String actualTitle=driver.getTitle();  //actual
    		
    		if(expectedTitle.equals(actualTitle)) {
    			System.out.println("Test Case is passed");
    		}
    		else
    		{
    			System.out.println("Test case is failed");
    		}
      		
      		
      		
		
		

	}

}
