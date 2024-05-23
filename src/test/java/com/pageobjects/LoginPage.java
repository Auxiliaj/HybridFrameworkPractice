package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

	private static LoginPage loginPage;
	
	private LoginPage(){
		
	}
	
	public static LoginPage getInstance() {
		if(loginPage==null) {
			loginPage=new LoginPage();
		}
			return loginPage;
	}
	@FindBy(id="email")
	private WebElement eMail;
	@FindBy(id="pass")
	private WebElement accPassWord;
	@FindBy(id="send2")
	private WebElement signIn;
	@FindBy(partialLinkText = "Forgot Your Password?")
	private WebElement forgotPassWordLink;
	
	
	public static LoginPage getLoginPage() {
		return loginPage;
	}

	public void userEmail(String userEmail) {
		eMail.sendKeys(userEmail);
	}
	
	public void passWord(String loginpassWord) {
		accPassWord.sendKeys(loginpassWord);
	}
	public void clickSignIn() {
		signIn.click();
	}
	
	@FindBy(xpath="//html//div[2]//header/div[1]//li[2]/a")
	private WebElement signUpLink;
	public void signUpLink() {
		signUpLink.click();
	}
}
