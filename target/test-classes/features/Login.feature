Feature: Validate Login Functionalities
  Developer - Krina
  Tester - Priya

  Background: 
    Given user open website
    Then verify user is on login page

  Scenario: Verify user can login with valid credentials
    When user login with username "admin" and password "admin123"
    Then verify user is on homepage

