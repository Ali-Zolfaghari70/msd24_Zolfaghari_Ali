# Calculator
## Kurze Beschreibung
Ein einfacher Java-Konsolen-Taschenrechner, der grundlegende mathematische Operationen wie Addition, Subtraktion, Multiplikation und Division durchführt. Die Implementierung folgt dem Interface `ICalculator` und wird in ` CalculatorImpl ` umgesetzt.

## Installationsanleitung
   + **Java installieren:** Stellen Sie sicher, dass Java (JDK 17 oder höher) auf Ihrem System installiert ist.Falls nicht, laden Sie es [hier](https://www.oracle.com/java/technologies/downloads/#java17?er=221886) herunter und installieren Sie es.
   
   + Git (zur Verwaltung des Projekt-Repositorys)
   
 ### Ausführen mit Visual Studio Code
   1.  **Visual Studio Code instalieren:** Sie können [VS Code](https://code.visualstudio.com/) herunterladen und instalieren. 
   2.  **Installieren Sie die Java-Erweiterung** (falls nicht bereits vorhanden):
   - Gehen Sie zu `Extention`
   - Suchen Sie nach `Extension Pack for Java` und installieren Sie es.
   
  3. **Starten Sie das Programm in VS Code:**
 - Öffnen Sie `CalculatorImpl.java`.
 - Klicken Sie auf den `Run`-Button über der `main`-Methode oder drücken Sie `F5`.



## Features & Projektstruktur

   - Unterstützte Operationen: `+, -, *, /`.
     - **Addition**: add(double number1, double number2)
     - **Subtraction**: minus(double number1, double number2)
     - **Multiplication**: multiply(double number1, double number2)
     - **Division**: divide(double number1, double number2) (mit Fehlerbehandlung für ungültige Werte)

   - Implementiert über ein Interface (`ICalculator`)
  
## Verwendung in einer Java-Anwendung
1.**Verwenden Sie eine der Methoden in einer Java-Anwendung, z. B.: add()**
```
public static void main(String[] args) {
ICalculator calc = new CalculatorImpl();
double result = calc.add(10, 5);
System.out.println("Ergebnis: " + result);
}
```
   
## Projektstruktur:
```
CalculatorImpl/
├── src/ 
│   ├── at/fhj/iit/ 
│   │   ├── CalculatorImpl.java 
│   │   ├── ICalculator.java 
├── bin/ 
├── README.md 
└── .gitignore
```
## Links zu externen Ressourcen
- [Java SE Dokumentation](https://docs.oracle.com/en/java/javase/17/)


## Exercises

- [Exercise 1](exercise1.md)
  
  >**Beschreibung**: Erstellen Sie eine grundlegende README-Datei und üben Sie
  Markdown-Syntax (Überschriften, Links, Bilder)

- Exercise 2 (hinzugefügt werden.)
    
- Exercise 3 (hinzugefügt werden.)
- Exercise 4 (hinzugefügt werden.)
- Exercise 5 (hinzugefügt werden.)
- Exercise 6 (hinzugefügt werden.)

## Autor
- **Ali Zolfaghari**
 
- **GitHub Profile:** [Ali Zolfaghari](https://github.com/Ali-Zolfaghari70)
- **Universität:** [FH Joanneum](https://www.fh-joanneum.at/)