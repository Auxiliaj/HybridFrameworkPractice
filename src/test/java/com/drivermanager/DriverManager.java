package com.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
    public static WebDriver driver;
	public static void driverInitialization() {
		try {
			switch(Constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				System.out.println("Initializing driver");
				driver= new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				System.out.println("Initializing driver");
				driver=new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				System.out.println("Initializing driver");
				driver=new EdgeDriver();
				break;
			case "IE":
				WebDriverManager.iedriver().setup();
				System.out.println("Initializing driver");
				driver= new InternetExplorerDriver();
				break;
			default :
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	public static WebDriver getDriver() {
		return driver;
		
	}

}
