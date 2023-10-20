package com.BDD.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import com.BDD.pages.RegistrationPage;
import com.BDD.utility.Common;

public class TestExecuter {
	



	
	
	
	
	public static void initWebelement() {
		
		PageFactory.initElements(DriverManager.getDriver(), RegistrationPage.class);
	}

}
