Feature: Check login functionality
  
  @Smoke
  Scenario: 
    Given user is in login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to homepage

  @Smoke
  Scenario: 
    Given user is in login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to homepage
