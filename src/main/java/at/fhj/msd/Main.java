package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
* Beispiel einer Anwendungsklasse zur Demonstration der Funktionalität.
*/
public class Main {
    
   private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {

        
       Calculator calc = new Calculator();

        System.out.println("Ali Zolfaghari");

        System.out.println(calc.add(7, 21));
        System.out.println(calc.subtract(7, 21));
        System.out.println(calc.divide(7, 21));
        System.out.println(calc.multiply(21, 7));
        System.out.println(calc.divide(10, 3));

         logger.info("Das ist Info");
         logger.error("Das ist Error");

    }
       
}

