package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class Logout extends BaseClass {

	
	//********* Object 
	
	public static By link_logout = By.linkText("Logout");
	
	
	//*********** data
	
	public static void  logout() {
	 driver.findElement(link_logout).click();
	
	 System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}
}
