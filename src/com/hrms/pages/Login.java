package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class Login extends BaseClass{
	
	//*********** Object

	public static By txt_un = By.name("txtUserName") ;
	public static By txt_pw = By.name("txtPassword");
	public static By btn_login = By.name("Submit");
	  
	//************* Method
	
	public static void login(String un , String pw) {
		driver.findElement(txt_un).sendKeys(un);
		driver.findElement(txt_pw).sendKeys(pw);
		driver.findElement(btn_login).click();
		
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
	}
	

}
