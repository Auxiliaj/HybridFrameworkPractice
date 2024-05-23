package com.utility;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.constants.Constants;
import com.drivermanager.DriverManager;
import com.pageobjects.LoginPage;

public class CommonUtilities {
public  void loadProperties() {
		
		
		Properties properties=new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Constants.APP_URL= properties.getProperty("Url");
		Constants.BROWSER=properties.getProperty("Browser");
		Constants.FIRSTNAME=properties.getProperty("FristName");
		Constants.LASTNAME=properties.getProperty("LastName");
		Constants.EMAIL=properties.getProperty("Email");
		Constants.PASSWORD=properties.getProperty("Password");
		Constants.CONFIRMPASSWORD=properties.getProperty("ConfirmPasswword");
}
	public static void initElements() {
		try {
		
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}
