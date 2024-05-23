#Author: auxiliarosely466@gmail.com

@SoftwareTestingApplication
Feature: login page
    
  @Login
   Scenario: Verify whether user is able to login with a customer account
    Given I navigated to software testing web application 
     When I clicked on signup link
    And I have entered user name as "rossgeller@gmail.com" and password as "Rachel*12"
    And Clicked on signIn button
    Then I validate customer login