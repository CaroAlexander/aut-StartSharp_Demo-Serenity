#Autor: Yair Alexander Tobar Caro
@stories
Feature: Login StartSharp
  As a user, with right admin credentials, I want to log in to see the Dashboard.
  @scenario1
  Scenario: Login with right credentials to see the Dashboard.
    Given than Alex, a registered user of the StartSharp application, wants to log in to the StartSharp main page to view the Dashboard
    When he navigates to the login page and provides this correct login credentials in the login form and clicks the Sign button
    Then he should be redirected to the dashboard main page