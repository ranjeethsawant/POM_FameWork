package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static void open() {
		
	System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("App Open");
	Reporter.log("App Open");
	}
	
	
	public static void close() {
		driver.close();
		System.out.println("Close App");
		Reporter.log("Close App");
			
	}
	
	
	}

