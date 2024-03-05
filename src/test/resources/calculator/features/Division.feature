Feature: Division of two integer numbers

  Background: Start with a Calculator
    Given I have an integer Calculator

  Scenario Outline: Divide one number by another number that is not zero
    When I enter <Arg0> and <Arg1>
    And I press the division button
    Then the result should be <Res>
    Examples:
      | Arg0 | Arg1 | Res |
      |  6   |  3   |  2  |
      |  0   |  3   |  0  |
      |  27  |  3   |  9  |
      |  27  |  -3  | -9  |
      |  -27 |  3   | -9  |
      |  -27 |  -3  |  9  |

  Scenario: Divide one number by zero
    When I enter one number and zero
    And I press the division button
    Then the Calculator must warn me that division by zero is not possible