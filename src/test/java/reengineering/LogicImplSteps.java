package reengineering;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class LogicImplSteps {
    private static final int BOARD_SIZE = 2;
    private Logic logic;
    private boolean playerMoved = false;

    @Given("I have a LogicImpl")
    public void IHaveALogicImpl(){
        this.logic = new LogicImpl(BOARD_SIZE);
    }

    @When("The user moves their rook in the same row or column of the computer's one")
    public void theUserMovesTheirRookInTheSameRowColumnOfTheComputerSOne() {
        this.logic = new LogicImpl(BOARD_SIZE, new Pair<>(0, 0), new Pair<>(1, 1));
        logic.humanMove(1, 0);
    }

    @Then("The computer eats the user's tower and the game ends")
    public void theComputerEatsTheUserSTower() {
        this.logic.computerMove();
        assertTrue(this.logic.over());
    }

    @When("The user moves their rook in a different row or column of the computer's one")
    public void theUserMovesTheirRookInADifferentRowOrColumnOfTheComputerSOne() {
        this.logic = new LogicImpl(BOARD_SIZE, new Pair<>(0, 0), new Pair<>(0, 1));
        logic.humanMove(1, 0);
    }

    @Then("The computer moves randomly")
    public void theComputerMovesRandomly() {
        this.logic.computerMove();
        assertFalse(this.logic.over());
    }

    @When("The user try to move diagonally")
    public void theUserTryToMoveDiagonally() {
        playerMoved = logic.humanMove(
                (logic.getPosition(Logic.Player.HUMAN).getX()+1)%2,
                (logic.getPosition(Logic.Player.HUMAN).getY()+1)%2);
    }


    @Then("The user rook is not moved")
    public void theUserRookIsNotMoved() {
        assertFalse(playerMoved);
    }

    @When("The user move their rook on the same position as the computer's one")
    public void theUserMoveTheirRookOnTheSamePositionAsTheComputerSOne() {
        this.logic = new LogicImpl(BOARD_SIZE, new Pair<>(0, 0), new Pair<>(1, 0));
        logic.humanMove(1, 0);
    }

    @Then("The user wins")
    public void theUserWins() {
        assertTrue(logic.over());
    }
}
