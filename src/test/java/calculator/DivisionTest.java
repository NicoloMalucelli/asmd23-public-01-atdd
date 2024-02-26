package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    void acceptanceTest(){
        Calculator calculator = new Calculator();

        calculator.enter(6);
        calculator.enter(2);
        calculator.divide();
        assertEquals(3, calculator.getResult());

        calculator.enter(3);
        calculator.divide();
        assertEquals(1, calculator.getResult());

        calculator.enter(0);
        assertThrows(ArithmeticException.class, () -> calculator.divide());
    }

}
