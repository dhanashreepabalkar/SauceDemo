package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0001VerifyLogin extends TestBaseClass{
	@Test()
	public void verifyLoginFunctionality  ()
	
	{
		//HomePage validation
		//assertions
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		//Assert.assertEquals(actualTitle,expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Test case is failed");
	}
}
