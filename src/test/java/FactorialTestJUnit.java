import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTestJUnit {

    private final Factorial calculator = new Factorial();

    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Number must be non-negative.", exception.getMessage());
    }
}
