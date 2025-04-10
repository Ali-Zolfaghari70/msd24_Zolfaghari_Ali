package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

  Logger logger = LogManager.getLogger(Calculator.class);

  public int add(int a, int b) {
    logger.debug("add aufgerufen mit Parametern: a={}, b={}", a, b);
    return a + b;
}

public int subtract(int a, int b) {
    logger.debug("subtract aufgerufen mit Parametern: a={}, b={}", a, b);
    return a - b;
}

public int multiply(int a, int b) {
    logger.debug("multiply aufgerufen mit Parametern: a={}, b={}", a, b);
    return a * b;
}

public int divide(int a, int b) {
    logger.debug("divide aufgerufen mit Parametern: a={}, b={}", a, b);
    if (b == 0) {
        logger.error("Nulldivision erkannt: {} / {}", a, b);
        throw new ArithmeticException("Division durch Null");
    }
    return a / b;
}

public int factorial(int n) {
    logger.info("Factorial of:" + n);
    return (n <= 1) ? 1 : n * factorial(n - 1);
   }
    
    /* 

    public double add(double number1, double number2) {
     return number1 + number2;
 }

   public double minus(double number1, double number2) {
     return number1 - number2;
  }


  public double divide(double number1, double number2) {
    //  double quotient = number1 / number2;
    //  if (Double.isNaN(quotient) || Double.isInfinite(quotient))
    //      throw new ArithmeticException("Division " + number1 + " / " + number2 + " isn't possible");

    if (number2 ==0.0){
        throw new ArithmeticException("Division durch 0 ist nicht erlaubt! ");
    }
      return number1 / number2;
  }

  public double multiply(double number1, double number2) {
     return number1 * number2;
 }

//  public int factorial(int n) {
//   if (n == 0) return 1;
//   return n * factorial(n - 1);
//  }

//  public int factorial(int n) {
//   return (n <= 1) ? 1 : n * factorial(n - 1);
//  }

// public int factorial(int n) {
//   return 0; // Platzhalter, damit alle Tests zuerst fehlschlagen
// }

public int factorial(int n) {
  if (n < 0) {
      return 0; // Vereinbarte Regel: Fakultät für negative Zahlen = 0
  }
  int result = 1;
  for (int i = 1; i <= n; i++) {
      result *= i;
  }
  return result;
}
*/

/* 
public double add(double number1, double number2)
{
      logger.info("added number 1: " + number1 + " and number 2:" + number2);
       return number1 + number2;  
}
public double minus(double number1, double number2)
{
      logger.info("subtracted number 1: " + number1 + " and number 2:" + number2);
       return number1 - number2; 
}
public double divide(double number1, double number2)
{ 
      logger.info("divide called with: number1 =" + number1 + ", number2 =" + number2);
      if (number2 == 0)
      {
            logger.error("Division called with 0!");
            throw new ArithmeticException("Division by 0 not possible");
      }
      return number1 / number2;

}

public double multiply(double number1, double number2)
{
      logger.info("Multiplied number 1: " + number1 + " and number 2:" + number2);
       return number1 * number2; 
}

public int factorial(int n) {
      logger.info("Factorial of:" + n);
      return (n <= 1) ? 1 : n * factorial(n - 1);
     }
*/

}

