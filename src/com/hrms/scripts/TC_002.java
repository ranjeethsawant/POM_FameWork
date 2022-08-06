package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.Del_Emp;
import com.hrms.pages.Login;
import com.hrms.utility.BaseClass;

public class TC_002 {

	@Test                                               //********** TestNg
	public static void tc_002() {
		
		DOMConfigurator.configure("log4j.xml");         // ********* log4j
		
		BaseClass.open();
		Login.login("nareshit","nareshit");
		Del_Emp.enter_frame();
		Del_Emp.add_Emp("4103");
		Del_Emp.exit_frame();
		BaseClass.close();
		
}
}