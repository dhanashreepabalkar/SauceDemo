package com.SauceDemo.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.HomePOMClass;
import com.SauceDemo.UtilityPackage.ScreenShotClass;

public class TC0004VerifyMultiProduct extends TestBaseClass{
	@Test()
	public void verifyMultiProduct() throws IOException {
		
		HomePOMClass hp=new HomePOMClass(driver);   
 		hp.clickallproducts();
 		System.out.println("all products added to cart");
 		ScreenShotClass.takeScreenshot(driver);
 		
 		String expectedCount="6";
 		String actualCount=hp.getTextFromAddToCart();
 		Assert.assertEquals(actualCount, expectedCount);
		

		
	}

}
