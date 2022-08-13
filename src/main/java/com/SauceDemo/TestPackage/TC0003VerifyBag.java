package com.SauceDemo.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;
import com.SauceDemo.UtilityPackage.ScreenShotClass;

public class TC0003VerifyBag extends TestBaseClass {
	@Test()
	public void verifybagproduct() throws IOException {
		
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.clickbagtocart();
		System.out.println("bag product added to cart");
		
		hp.clickaddtocart();
		System.out.println(" bag product in cart");
		
		ScreenShotClass.takeScreenshot(driver);
		//validation
		
		String expectedCount="1";
		String actualCount=hp.getTextFromAddToCart();
		Assert.assertEquals(actualCount, expectedCount);
	}

}
