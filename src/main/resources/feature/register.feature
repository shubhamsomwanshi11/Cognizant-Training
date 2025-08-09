Feature: User Registration

  As a new user
  I want to register an account
  So that I can access the system

  Scenario: Successful registration with valid details
    Given the user is on the registration page
    When the user enters first name "Shubham"
    And the user enters last name "Somwanshi"
    And the user enters date of birth "02/16/2003"
    And the user enters email "shubham@gmail.com"
    And the user enters phone number "8888888888"
    And the user selects gender "Male"
    And the user enters password "Pass@123"
    And the user clicks the register button
    Then the user should be redirected to the account/dashboard page

  Scenario: Registration fails with missing required fields
    Given the user is on the registration page
    When the user enters first name "Shubham"
    And the user leaves email and password fields empty
    And the user clicks the register button
    Then the user should stay on the registration page

  Scenario: Registration fails with invalid email
    Given the user is on the registration page
    When the user enters first name "Shubham"
    And the user enters last name "Somwanshi"
    And the user enters date of birth "02/16/2003"
    And the user enters email "invalid-email"
    And the user enters phone number "8888888888"
    And the user selects gender "Male"
    And the user enters password "Pass@123"
    And the user clicks the register button
    Then the user should stay on the registration page

  Scenario: Registration fails with short password
    Given the user is on the registration page
    When the user enters first name "Shubham"
    And the user enters last name "Somwanshi"
    And the user enters date of birth "02/16/2003"
    And the user enters email "shubham@gmail.com"
    And the user enters phone number "8888888888"
    And the user selects gender "Male"
    And the user enters password "123"
    And the user clicks the register button
    Then the user should stay on the registration page

  Scenario: Registration fails when gender is not selected
    Given the user is on the registration page
    When the user enters first name "Shubham"
    And the user enters last name "Somwanshi"
    And the user enters date of birth "02/16/2003"
    And the user enters email "shubham@gmail.com"
    And the user enters phone number "8888888888"
    And the user leaves gender unselected
    And the user enters password "Pass@123"
    And the user clicks the register button
    Then the user should stay on the registration page

  Scenario: Registration fails with all fields empty
    Given the user is on the registration page
    When the user clicks the register button
    Then the user should stay on the registration page
