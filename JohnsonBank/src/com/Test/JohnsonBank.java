package com.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JohnsonBank 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.johnsonbank.com/");
		driver.findElement(By.linkText("Personal")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Mobile Banking")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2050)", "");
		
		
		
		driver.findElement(By.xpath("//*[@title='Android App on Google Play.']")).click();
		
	
	}

}
