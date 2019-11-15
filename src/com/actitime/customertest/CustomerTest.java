package com.actitime.customertest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actttime.genericlib.BaseClass;

public class CustomerTest extends BaseClass{
	
	@Test
	public void createCustomerTest(){
		// navigate task Page"
		  driver.findElement(By.xpath("//div[text()='Tasks']/..")).click();
		  
		//click on Project & Customer Link
		  driver.findElement(By.linkText("Projects & Customers")).click();
		  
		//click on create New Customer Button
		  driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		  
		//create Customer
		  driver.findElement(By.name("name")).sendKeys("uuu");
		  driver.findElement(By.name("createCustomerSubmit")).click();
		  
	}
	
}





