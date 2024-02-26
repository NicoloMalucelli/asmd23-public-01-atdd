Feature: I want to be able to divide two numbers using a Calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario Outline: Divide one number by another number that is not zero
    When I divide <Arg0> by <Arg1>
    Then the result is <Res>
    Examples:
    | Arg0 | Arg1 | Res |
    |  6   |  3   |  2  |
    |  0   |  3   |  0  |

  Scenario: Divide one number by zero
    When I divide any number by zero
    Then the Calculator must warn me that division by zero is not possible