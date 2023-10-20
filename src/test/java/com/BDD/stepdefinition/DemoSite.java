package com.BDD.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.BDD.pages.RegistrationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DemoSite  {
	
	@Given("launch chrome browser and open URL")
	public void launch_chrome_browser_and_open_URL() {
	RegistrationPage.Enterfirstname();
	
		
	    

	}

	@When("user click Firstname and enter the values {string}")
	public void user_click_Firstname_and_enter_the_values(String firsttname) {

	
	}
	@When("user click Secondname and enter the  values {string}")
	public void user_click_Secondname_and_enter_the_values(String lastnamee) {
	
	}

	@When("user click address and enter the values {string}")
	public void user_click_address_and_enter_the_values(String addresss) {

	}
     
	@When("user click mailid and enter the values {string}")
	public void user_click_mailid_and_enter_the_values(String emaill) {
	
	}

	@When("user click phone and enter the values {string}")
	public void user_click_phone_and_enter_the_values(String phonee) {
	  
	}

	@Then("user validate the page title as {string}")
	public void user_validate_the_page_title_as(String register) {
	  
	}



}
