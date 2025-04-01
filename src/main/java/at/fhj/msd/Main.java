package at.fhj.msd;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        

        System.out.println("Willkommen beim Taschenrechner!");
        System.out.print("Erste Zahl eingeben: ");
        double num1 = scanner.nextInt();

        System.out.print("Operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Zweite Zahl eingeben: ");
        double num2 = scanner.nextInt();

        double result;
        try {
            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.minus(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Ungültiger Operator!");
                    return;
            }
            System.out.println("Ergebnis: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        scanner.close();

        Calculator fact = new Calculator();
       System.out.println(fact.factorial(0));
    }
       
}

