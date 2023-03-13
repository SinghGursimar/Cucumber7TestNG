@prod
Feature: Login test in prod environment
  		 In Order to Login as User 
  		 Correct username and password should be entered in production env

 
  Scenario Outline: Login with different Roles in production
    Given user navigates to application url
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user enters valid captcha code
    And user clicks on the sign in button

    Examples: 
      | username | password |
      | admin    | admin    |
      | finance  | finance  |
      | PM       | Pm       |
      | Planning | Planning |
