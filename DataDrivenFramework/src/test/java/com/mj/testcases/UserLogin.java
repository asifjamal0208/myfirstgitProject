package com.mj.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mj.base.TestBase;

public class UserLogin extends TestBase {
	
	@Test
	public void addCustomer(String username, String password ) throws InterruptedException {
		
		
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys(username);
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(OR.getProperty("loginbutton"))).click();
	
	//	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	//	Assert.assertTrue(alert.getText().contains(alerttext));
 	//	Thread.sleep(3000);  
	//	alert.accept();
	    
	}
	
	@DataProvider
	public Object[][] getData(){
		
		String sheetName="AddCustomerTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<=rows; rowNum++) {
			for(int colNum=0; colNum<cols; colNum++) {
				//data[0][0]
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
	}  
	
}
