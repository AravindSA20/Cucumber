Feature: Test for Google application

  Background: 
    Given Open Google application

  Scenario: Test Google page title
    #Given Open Google application
    When I capture the current page title
    Then Title should match with Google

  Scenario: Test Search feature woth valid keyword of Google
    #Given Open Google application
    When I search valid keyword in search box
    Then Google application should display valid result
