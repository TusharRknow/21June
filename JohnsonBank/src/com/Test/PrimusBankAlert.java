package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBankAlert 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com/home.aspx");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
