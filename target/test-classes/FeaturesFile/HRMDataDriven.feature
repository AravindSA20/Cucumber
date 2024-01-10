Feature: Test OrangeHRM Application

  Scenario Outline: Test login functionality for data driven test
    Given Open OrangeHRM application
    When User enters username "<User>" and enters password "<Pswd>"
    When User clicks on Login button ftom Login pannel
    Then User should be able to login and navigate to Dashboard page

    Examples: 
      | User  | Pswd     |
      | Admin | admin123 |
      | Sanju | mitzi15  |
      | Admin | admin123 |
      | Raam  | subhu03  |
