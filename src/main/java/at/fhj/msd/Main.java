package at.fhj.msd;

public class Main {
    
   // private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {

        // logger.info("Info log message");
        // logger.error("Error log message");
        /* 
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
       */

       Calculator calc = new Calculator();

        System.out.println("Ali Zolfaghari");

        System.out.println(calc.add(7, 21));
        System.out.println(calc.subtract(7, 21));
        System.out.println(calc.divide(7, 21));
        System.out.println(calc.multiply(21, 7));
        System.out.println(calc.divide(10, 0));

        // logger.info("Das ist Info");
        // logger.error("Das ist Error");

    }
       
}

