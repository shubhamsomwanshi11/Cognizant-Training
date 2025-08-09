Feature: User Login

  As a registered or unregistered user
  I want to login to the system
  So that I can access my account or get proper error feedback

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid email "shubham@gmail.com"
    And the user enters valid password "Pass@123"
    And the user clicks the login button
    Then the user should be redirected to the account/dashboard page

  Scenario: Login fails with incorrect password
    Given the user is on the login page
    When the user enters valid email "shubham@gmail.com"
    And the user enters invalid password "WrongPass"
    And the user clicks the login button
    Then the user should stay on the login page

  Scenario: Login fails with invalid email format
    Given the user is on the login page
    When the user enters invalid email "invalid-email"
    And the user enters valid password "Pass@123"
    And the user clicks the login button
    Then the user should stay on the login page

  Scenario: Login fails with empty fields
    Given the user is on the login page
    When the user leaves the email and password fields empty
    And the user clicks the login button
    Then the user should stay on the login page

  Scenario: Login fails with unregistered email
    Given the user is on the login page
    When the user enters unregistered email "fakeuser@test.com"
    And the user enters valid password "SomePass@123"
    And the user clicks the login button
    Then the user should stay on the login page
