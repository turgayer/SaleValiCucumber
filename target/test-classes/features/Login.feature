Feature: Login test

  Scenario: Login as a user
    Given User is on the login page
    When User enters user credentials
    Then User should be able to login