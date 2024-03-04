Feature: I want to handle the navigation between the different sections of the website

Scenario Outline: : Navigation
  When the user click on <Element> on the nav bar
  Then the user is redirected to the <Element> section
  Examples:
  |Element|
  |home |
  |profile|
  |myCars|
  |history|
  |myPasses|