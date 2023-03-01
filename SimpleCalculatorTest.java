import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }
}
