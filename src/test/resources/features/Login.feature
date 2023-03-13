Feature: Login Feature
  		 In Order to Login as User 
  		 Correct username and password should be entered

  Background: 
    Given user navigates to application url

  @positive
  Scenario: Login as Valid User
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the sign in button

  Scenario: Login as an Invalid User
    When user validates the homepage title
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the sign in button

  Scenario Outline: Login with different Roles
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the sign in button

    Examples: 
      | username | password |
      | admin    | admin    |
      | finance  | finance  |
      | PM       | Pm       |
      | Planning | Planning |
