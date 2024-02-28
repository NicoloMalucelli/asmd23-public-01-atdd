Feature: I want to handle the registration process of a web application

Background:
  Given the user is in the registration page

Scenario: Successful registration
  When the user insert all the information correctly
  And click on the register button
  Then the user is redirected to the home page

Scenario: Wrong password confirmation
  When the user try to register
  But the field password and password confirmation do not contain the same text
  Then an error message is shown

Scenario: Email already in use
  When the user try to register
  But the given email is already in use
  Then an error message is shown