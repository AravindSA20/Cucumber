Feature: Test OpenCart application

  Scenario: Test Register feature with valid data using DataTable
    Given Open Register page of OpenCart application
    When User enter required fields with valid data
      | fname | lname | email               | tele       | pswd    | cnfmpswd |
      | Mitzi | Chan  | mitzichan@gmail.com | 9894129931 | messi10 | messi10  |
    When User click on the Yes radio button
    When User check privacy policy
    When User click on Continue button
    Then User should be able to register in OpenCart
