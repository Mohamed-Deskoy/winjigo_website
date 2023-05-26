@smoke
Feature: Sign-In
  Scenario: User sign-in with valid credentials
    Given user go to login page
    When sign in with valid credentials
    And navigate to the courses page
    And click on the create course button
    And fill in the course basic info
    And save the course
    Then should see the course title displayed
