package com.BDD.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;



public class DriverManager {
	
	private static WebDriver driver =null;

	public static WebDriver getDriver() {
		return driver;
	}
	@Before
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\tamil\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-orgins=*");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println("i love you dharani umma");
		
		TestExecuter.initWebelement();
	
	}
		
	}


