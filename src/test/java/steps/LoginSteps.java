package steps;

import com.constants.Constants;
import com.drivermanager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.pageobjects.LoginPage;

public class LoginSteps {
	
	@Given("I navigated to software testing web application")
	public  void i_navigated_to_para_bank_web_application() {
	   DriverManager.getDriver().get(Constants.APP_URL);
		  
	}
	
	 @When("I clicked on signup link")
	 public void iClickedOnSignupLink() {
		 
		 LoginPage.getInstance().signUpLink();
	 }
	 @When("I have entered user name as {string} and password as {string}")
	 public void iHaveEnteredUserNameAsAndPasswordAs(String userId, String password) {
		 LoginPage.getInstance().userEmail(Constants.EMAIL);
		 LoginPage.getInstance().passWord(Constants.PASSWORD);
	    
	 }
	 @When("Clicked on signIn button")
	 public void clickedOnSignInButton() {
		 LoginPage.getInstance().clickSignIn();
	    
	 }
	 @Then("I validate customer login")
	 public void iValidateCustomerLogin() {
		 String url;
		try {
			url = DriverManager.getDriver().getCurrentUrl();
			 System.out.println(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	     
	 }

}
