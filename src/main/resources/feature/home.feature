Feature: Category Navigation on Home Page

  As a user
  I want to navigate through different collections
  So that I can explore MEN, WOMEN, KIDS, and FOOTWARE products

  Scenario: Navigate to MEN collection
    Given the user is on the home page
    When the user clicks on the MEN collection
    Then the MEN collection page should load successfully

  Scenario: Navigate to WOMEN collection
    Given the user is on the home page
    When the user clicks on the WOMEN collection
    Then the WOMEN collection page should load successfully

  Scenario: Navigate to KIDS collection
    Given the user is on the home page
    When the user clicks on the KIDS collection
    Then the KIDS collection page should load successfully

  Scenario: Navigate to FOOTWARE collection
    Given the user is on the home page
    When the user clicks on the FOOTWARE collection
    Then the FOOTWARE collection page should load successfully
