package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class Del_Emp extends BaseClass {
	
//************ Object
	
	public static By btn_dropdown = By.name("loc_code");
	public static By txt_box = By.xpath("//input[@type='text']") ;
	public static By btn_srch = By.xpath("//input[@type='button'][@value='Search']");
	public static By btn_chkbok = By.xpath("//input[@type='checkbox'][@value='4103']");
	public static By btn_dlt = By.xpath("//input[@type='button'][@value='Delete']");
	
	
	//*******method
	
	public static void add_Emp(String Emp_no) {
		Select st = new Select(driver.findElement(btn_dropdown));
		st.selectByVisibleText("Emp. ID");
	    driver.findElement(txt_box).sendKeys(Emp_no);
	    driver.findElement(btn_srch).click();
	    driver.findElement(btn_chkbok).click();
	    driver.findElement(btn_dlt).click();
	    
	    System.out.println("Delete Emp Record");
	    Reporter.log("Delete Emp Record");
	    Log.info("Delete Emp Record");
	}
		
		public static void enter_frame() { 
			driver.switchTo().frame("rightMenu");
			 System.out.println("Enter into frame");
			    Reporter.log("Enter into frame");
			    Log.info("Enter into frame");
		}
		public static void exit_frame() { 
			driver.switchTo().defaultContent();
			 System.out.println("Exit into frame");
			    Reporter.log("Exit into frame");
			    Log.info("Exit into frame");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	

