package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;

public class TC0002VerifyLogout  extends TestBaseClass {
	@Test()
	public void verifyLogoutFuctionality() {
		
		
		HomePOMClass hp= new HomePOMClass(driver);  //created object of HOMEPOM class
  		hp.clickSettingButton();
  		System.out.println("clicked on setting button");
  		
  		hp.clickLogoutButton();
  		System.out.println("clicked on logout and land up on login page again");
  		
  		//validation
  		String expectedTitle="Swag Labs";
  		String actualTitle=driver.getTitle();
  		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
