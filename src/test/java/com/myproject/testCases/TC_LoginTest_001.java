package com.myproject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myproject.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest (){
		
		LoginPage lp=new LoginPage(driver); 
		lp.setUserName(username);
		logger.info("Username entered");
		lp.setPassword(password);  
		logger.info("Password entered");
		lp.clickSubmit(); 
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")){
		
		Assert.assertTrue(true);
		logger.info("Test Passed");
	}
	
	 	else {
		Assert.assertTrue(false);
		logger.info("Test Failled");
	}
	
}

	
}
		