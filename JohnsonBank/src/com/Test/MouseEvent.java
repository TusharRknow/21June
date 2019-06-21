package com.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver drive=new FirefoxDriver();
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drive.get("https://www.softwaretestingmaterial.com/");

		Actions action=new Actions(drive);
		action.moveToElement(drive.findElement(By.xpath("//*[@id='menu-item-4358']/a/span"))).perform();
		Thread.sleep(1000);
		action.moveToElement(drive.findElement(By.xpath("//*[@id='menu-item-4350']/a/span"))).perform();
		Thread.sleep(1000);
		action.moveToElement(drive.findElement(By.xpath("//*[@id='menu-item-4351']/a/span"))).perform();
		action.contextClick(drive.findElement(By.xpath("//*[@id='menu-item-4351']/a/span"))).perform();
		
		
	}

}
