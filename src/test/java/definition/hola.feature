# language: en
Feature: Product Login
  As a user, I would like to be able to use my credentials to successfully
  login.

  Rule:
  - The user must have a valid username
  - The user must have a valid password
  - The user must have an active subscription
  - User is locked out after 3 invalid attempts
  - User will get a generic error message following
  login attempt with invalid credentials

    Background: The user starts out on the login page

    @RegressionTest
    Scenario Outline: The user successfully logs in with their account
    This scenario outlines tests in which various users attempt
    to sign in successfully

      Given the user is on the login page
      When the user enters their <username>
      And the user enters their <password>
      Then the user should be successfully logged on

      Examples:
        | username | password |
        | frank    | 1234     |
        | jack     | 4321     |