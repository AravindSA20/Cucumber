Feature: Test CRM Application

  Background: 
    Given Open CRM Homepage

@SignIn
  Scenario: Test for SignIn Link
    When User click on SignIn
    Then SignIn page should be open

@LogIn
  Scenario: Test for CRM Login functionality with valid data
    When User enter valid email "test123@gmail.com" and valid password "test123"
    When User click on Submit button
    Then User should be able to login and navigate to Customers page
