Feature: Login Demo for new user

  Scenario Outline: Demo for login
    Given User launches browser
    When User is on login page
    When Enters <username> and <password>
    And Clicks on login button
    Then User is navigated to home page

    Examples: 
      | username | password |
      | Sarath   |    12345 |
      | Kiran    |    12345 |
      | Kate     |    12345 |
