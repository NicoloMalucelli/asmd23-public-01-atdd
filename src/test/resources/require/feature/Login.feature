Feature: I want to handle the login process of a web application

Background:
  Given the user is in the login page

Scenario: Successful login
  When the user insert the correct username and password
  And click the login button
  Then the user is redirected to the homepage

Scenario: Wrong credential
  When the user insert the wrong credential
  And click the login button
  Then an error message is shown
  And the fields are cleaned

Scenario: Registration
  When the user click on register
  Then the user is redirected to the registration page