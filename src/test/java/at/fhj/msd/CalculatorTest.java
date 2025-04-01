package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
      private Calculator calc;
  
      /**
     * 
     */
    @BeforeEach
      void setUp() {
          calc = new Calculator();
      }

    @Test
    @DisplayName("Addition mit normalen Werten")
    void testAddNormalValues() {
        assertEquals(5, calc.add(2, 3), "Addition von 2 und 3 sollte 5 ergeben");
    }

    @Test
    @DisplayName("Addition mit Nullwerten")
    void testAddWithZero() {
        assertEquals(0, calc.add(0, 0), "Addition von 0 und 0 sollte 0 ergeben");
    }

    @Test
    @DisplayName("Addition mit negativen Werten")
    void testAddWithNegative() {
        assertEquals(1, calc.add(-2, 3), "Addition von -2 und 3 sollte 1 ergeben");
    }

    @Test
    @DisplayName("Division mit normalen Werten")
    void testDivideNormalValues() {
        assertEquals(5, calc.divide(10, 2), "Division von 10 durch 2 sollte 5 ergeben");
    }

    @Test
    @DisplayName("Division durch Null sollte eine Exception werfen")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0), "Division durch 0 sollte eine ArithmeticException werfen");
    }
    @Test
    void testFactorial() {
    Calculator calc = new Calculator();
    assertEquals(120, calc.factorial(5)); // Test schlägt fehl, weil die Methode noch nicht existiert
    }

    @Test
    @DisplayName("Fakultät von 0 sollte 1 sein")
    void testFactorialZero() {
        assertEquals(1, calc.factorial(0), "Fakultät von 0 sollte 1 sein");
    }

    @Test
    @DisplayName("Fakultät von 5 sollte 120 sein")
    void testFactorialFive() {
        assertEquals(120, calc.factorial(5), "Fakultät von 5 sollte 120 sein");
    }

    @Test
    @DisplayName("Fakultät für negative Zahlen sollte 0 sein")
    void testFactorialNegative() {
        assertEquals(0, calc.factorial(-3), "Fakultät für negative Zahlen sollte 0 sein");
    }

}
