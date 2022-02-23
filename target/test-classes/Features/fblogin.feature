
#Sample Feature Definition Template
@tag
Feature: Validate the funtionality of Facebook login
  

  @tag1
  Scenario: Validate the funtionality of Facebook login with valid credentials
    Given Launch the browser
    And Open the facebook application
    When Enter the username and password
    And Click the login button
  
    Then I validate the outcomes
    And close the browser
  