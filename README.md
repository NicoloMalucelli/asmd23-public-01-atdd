# Acceptance testing

## Task 1: CALCULATOR

### description

The calculator has been enanched by implementing the division. 
Between the different operators has been chosen the division because is the one that allows to explore more interesting situation, like the division by zero.

The division feature has been described using two features: 
- Divide one number by another number that is not zero
- Divide one number by zero

The first of these scenarios has been tested using multiple examples, considering both concordant and not-concordant numbers. The case in which the numerator is zero has also been tested.

Since the calculator is an integer calculator, the result of each division is always an integer value.

### observations

While working with Gherkin, everything worked as expected. The Cucumber's plugin for IntelliJ has simplified the steps' skeleton definition and the tests execution.
By using Gherkin, I have been able to write tests that can be easy read by everyone

## Task 3: REENGINEERING

### description

The goal of the project I chose was to simulate a chess-like game with only two rooks: one moved by the player and the other moved in a
pseudo-random way from the computer.

The behaviour of the application has been easily described through the scenarios:
- The computer eats user's rook when possible
- The computer moves randomly when eating user's rook is not possible
- The user cannot move diagonally
- The user eat the computer's rook

### observations

Due to the pseudo-random behaviour of the computer's rook, the system has been slightly refactored by adding a second constructor that allows to define the starting position of the two rooks.
However, this is the only change has been made to the original code, no further modifications have been done.

In order to be easily tested, every method of the application should respect the single-responsability-principle: the purpose of each method has to be clear and its boundaries well defined.

