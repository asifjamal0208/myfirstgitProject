package com.mj.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mj.base.TestBase;

public class LoginUser extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException{
		
//		System.setProperty("org.uncommons.reportng.escape-output","false");
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
	//	Thread.sleep(3000);
	//  	Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login not successfull");
		
	  	log.debug("Login successfully executed");
		
	  	Assert.fail("Login not successfull");
	}
}
