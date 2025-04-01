package at.fhj.msd;

public class Calculator {
    
    public Calculator(){
        
    }

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

 public int factorial(int n) {
  return (n <= 1) ? 1 : n * factorial(n - 1);
 }
 
}