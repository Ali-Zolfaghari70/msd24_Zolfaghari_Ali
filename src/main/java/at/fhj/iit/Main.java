package at.fhj.iit;

public class Main {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorImpl();
            double result = calc.add(10, 5);
            System.out.println("Ergebnis: " + result);
            double result01 = calc.minus(-20, 5);
            System.out.println("Ergebnis: " + result01);
            double result02 = calc.divide(20,56);
            System.out.println("Ergebnis: " + result02);
      }
}
