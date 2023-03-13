Feature: Login test in Staging environment
  		 In Order to Login as User 
  		 Correct username and password should be entered in Staging env

  Background: 
    Given user navigates to application url

  @positive
  Scenario: Login as Valid User in Staging
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the sign in button

  Scenario: Login as an Invalid User in Staging
    When user validates the homepage title
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the sign in button
