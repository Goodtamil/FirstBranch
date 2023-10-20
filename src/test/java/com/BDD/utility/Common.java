package com.BDD.utility;

import org.openqa.selenium.By;

import com.BDD.stepdefinition.DriverManager;

public class Common  {
	
	public void Entervalue(By locator, String value)
	{
		
		
		try
		{
			DriverManager.getDriver().findElement(locator).click();
		DriverManager.getDriver().findElement(locator).clear();
		DriverManager.getDriver().findElement(locator).sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println(" error occured"+e);
		}
	}public void validatepagtitle(String register) {
		 String title =DriverManager.getDriver().getTitle(); 
		 if(title.contains(register))
		 {
			 System.out.println("in "+"register"+" page");
		 }


}}
