Feature: Simulating a chess-like game with only two rooks, one moved by the player and the other moved in a
  pseudo-random way from the computer.

  Background: Start with a LogicImpl
    Given I have a LogicImpl

  Scenario: The computer eats user's rook when possible
    When The user moves their rook in the same row or column of the computer's one
    Then The computer eats the user's tower and the game ends

  Scenario: The user eat the computer's rook
    When The user move their rook on the same position as the computer's one
    Then The user wins

  Scenario: The computer moves randomly when eating user's rook is not possible
    When The user moves their rook in a different row or column of the computer's one
    Then The computer moves randomly

  Scenario: The user cannot move diagonally
    When The user try to move diagonally
    Then The user rook is not moved