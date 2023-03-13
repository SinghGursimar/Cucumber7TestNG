
Feature: Login test using Datable
  		 
## when datatable are used in scenario  a single scenario will be run with multiple data sets
# when used with Scenario Outline and examples the whole scenario is run again with each data set
 
  Scenario: Login functionality using Datatable
    Given user navigates to application url
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user enters firstname and lastname
    			| name1 | lname1 |
    			| name2 | lname2 |
    And user clicks on the sign in button
    
  
  Scenario: Login functionality using Datatable maps
    Given user navigates to application url
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user enters firstname and lastname using maps
    			| firstname | lastname | 
    			| name1     | lname1   |
    			| name2     | lname2   |
    And user clicks on the sign in button
    
  
    