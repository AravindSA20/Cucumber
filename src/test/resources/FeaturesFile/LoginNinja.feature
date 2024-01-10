Feature: Test for Open Cart application

  Scenario: Test Login for Cart with valid data
  Given Open Ninja OpenCart Login page
    When User enter valid credentials for login
      | email               | password |
      | mitzichan@gmail.com | messi10  |
    When User click Login button from cart page
    Then User should be able to login successfully into Open Cart application
