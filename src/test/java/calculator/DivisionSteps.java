package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionSteps {

    private Calculator calculator;
    private ArithmeticException exception;

    @Given("I have a calculator")
    public void IHaveACalculator(){
        this.calculator = new Calculator();
    }

    @When("I enter {int} and {int}")
    public void IEnterTwoNumbers(int arg0, int arg1){
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @When("I press the division button")
    public void IPressDivision(){
        try {
            this.calculator.divide();
        }catch (ArithmeticException ex){
            this.exception = ex;
        }
    }

    @Then("the result should be {int}")
    public void TheResultShouldBe(int res){
        assertEquals(res, this.calculator.getResult());
    }

    @When("I enter one number and zero")
    public void IEnterOneNumberAndZero(int arg0){
        this.calculator.enter(arg0);
        this.calculator.enter(0);
    }

    @Then("the Calculator must warn me that division by zero is not possible")
    public void IHaveDivisionByZeroError(){
        assertEquals(exception, new ArithmeticException("Division by zero is not possible"));
    }

}