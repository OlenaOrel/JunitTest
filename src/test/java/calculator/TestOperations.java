package calculator;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOperations {

    public static Operations operations;

    @BeforeClass
    public static void instant(){
        operations = new Operations();
    }

    @Test
    public void testAdd(){
        double result = operations.add(3.0, 6.0);
        assertTrue(result == 9.0);
    }

    @Test
    public void testSubtract(){
        double result = operations.subtract(3.0, 6.0);
        assertTrue(result == -3.0);
    }

    @Test
    public void testMultiply(){
        double result = operations.multiply(3.0, 6.0);
        assertTrue(result == 18.0);
    }

    @Test
    public void testDivide(){
        double result = operations.divide(3.0, 6.0);
        assertTrue(result == 0.5);
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDevException(){
        operations.divide(3.0, 0);
    }

}
