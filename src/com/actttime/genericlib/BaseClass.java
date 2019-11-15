package com.actttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver; //Global Object
	
	@BeforeClass
	public void configBC(){
		System.out.println("====Launch the Browser===");
		 driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void configBM() throws Throwable{
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://uftuser-pc:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
	}
	@AfterMethod
	public void configAM(){
		System.out.println("logout");
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void configAC(){
		System.out.println("======close the Browser====================");
		driver.close();
	}
}




