package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.utility.BaseClass;

public class TC_001   {

	@Test
	
	public static void tc_001() {
		DOMConfigurator.configure("log4j.xml");
		
	BaseClass.open();
	Login.login("nareshit", "nareshit");
	Logout.logout();
	BaseClass.close();
	}
	

}
