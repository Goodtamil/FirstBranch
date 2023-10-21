package com.BDD.pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import com.BDD.stepdefinition.DriverManager;
import com.BDD.stepdefinition.TestExecuter;


public class RegistrationPage extends TestExecuter {
	
	

	private  String firstnameL = "//input[@ng-model='FirstName']";
	private  String lastnameL  = "//input[@ng-model='LastName']";
	private  String addressL   = "//textarea[@ng-model='Adress']";
	private  String emailL   = "//input[@ng-model='EmailAdress']";
	private  String phoneL     = "//input[@ng-model='Phone']";

	@FindBy(xpath="//*[@type='search']")
	public static WebElement searchbox;
	
	public static void Enterfirstname()
	
	{
	
			searchbox.click();
			searchbox.sendKeys("i am an tester");
		
			
			

	
	}
	
	
	public void Enterlastname(String lastnamee)
	{
		
		
	} 
	
	
    public void Enteraddress(String addresss)
   {
	

	
   }

    public void Enteremail(String emaill)
    {

		
    }
    public void Enterphone(String phonee)
    {

    } 

}
