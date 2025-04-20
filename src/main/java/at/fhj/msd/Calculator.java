package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Die Klasse Calculator stellt grundlegende mathematische Operationen bereit,
 * wie Addition, Subtraktion, Multiplikation und Division.
 * 
 * <p>Diese Klasse dient zu Demonstrationszwecken im Rahmen der Übung 06.</p>
 * 
 * @author Ali Zolfaghari
 * 
 */

public class Calculator {

  Logger logger = LogManager.getLogger(Calculator.class);

  /**
 * Addiert zwei Zahlen und gibt die Summe zurück.
 * @param a die erste Zahl
 * @param b die zweite Zahl
 * @return die Summe von a und b
 */
  public int add(int a, int b) {
    logger.debug("add aufgerufen mit Parametern: a={}, b={}", a, b);
    return a + b;
}

/**
 * Subtrahieren zwei Zahlen.
 * 
 * @param a die Zahl, von der subtrahiert wird
 * @param b die Zahl, die subtrahiert wird
 * @return das Ergebnis der Subtraktion (a - b)
 */
public int subtract(int a, int b) {
    logger.debug("subtract aufgerufen mit Parametern: a={}, b={}", a, b);
    return a - b;
}

/**
 * Multipliziert zwei ganze Zahlen.
 * 
 * @param a erste Zahl
 * @param b zweite Zahl
 * @return Multiplikation von a und b
 */
public int multiply(int a, int b) {
    logger.debug("multiply aufgerufen mit Parametern: a={}, b={}", a, b);
    return a * b;
}

/**
 * Dividieren zwei Zahlen.
 * 
 * @param a erste Zahl
 * @param b zweite Zahl
 * @return das Ergebnis der Division (a / b)
 * @throws ArithmeticException wenn b gleich 0 ist
 */
public int divide(int a, int b) {
    logger.debug("divide aufgerufen mit Parametern: a={}, b={}", a, b);
    if (b == 0) {
        logger.error("Nulldivision erkannt: {} / {}", a, b);
        throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
    }
    return a / b;
}

 
/**
 * Fakultät einer Zahl.
 * 
 * @param n eine Zahl

 * @return Fakultät n
 */

public int factorial(int n) {
    logger.info("Factorial of:" + n);
    return (n <= 1) ? 1 : n * factorial(n - 1);
   }
}

