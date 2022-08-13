package com.SauceDemo.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {

	public static void takeScreenshot(WebDriver driver) throws IOException {
		// utility
		
		// date time format
		Date d =new Date();
		DateFormat d1=new SimpleDateFormat("dd-MM-yyyy & hh-mm-ss");
		String date=d1.format(d);
		
		//Screenshot
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile =new File("./ScreenShotFolder/SauceDemo"+date+".jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("Screenshot is Taken");

	}

}
