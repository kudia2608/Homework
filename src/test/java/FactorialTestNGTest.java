import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTestNGTest {

    private final Factorial calculator = new Factorial();

    @Test
    public void testFactorialZero() {
        assertEquals(calculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(calculator.factorial(1), 1);
    }

    @Test
    public void testFactorialFive() {
        assertEquals(calculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Number must be non-negative.")
    public void testFactorialNegative() {
        calculator.factorial(-1);
    }
}
