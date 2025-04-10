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

2. [**Exercise 2**](exercise2.md)

      >Einstieg in die Git-Befehle. Übungsziel: Git-Befehle kennerlernen und weiter die Markdown Syntax kennenlernen (z.B. Tabellen einfügen)

3. [**Exercise 3**](exercise3.md)

      >Einstieg zum erstellen erster Maven Projekte und kompilieren sowie ausführen mittels Maven

4. [**Exercise 4**](exercise4.md)
      >Einstieg zur erstellen von Testen mit JUnit, also  ganz Basic, dass man das Ergebnis einer Methode mit dem Ergebnis das rauskommen sollte (wenn die Methode richtig implemeiert worden ist)

 5. [**Exercise 5**](exercise5.md)
      >Einstieg in das Erstellen, Ändern und Arbeiten mit verschiedenen Branches sowie das Arbeiten mit der logging bibliothek
- Exercise 6 (hinzugefügt werden.)

## Autor
- **Ali Zolfaghari**
 
- **GitHub Profile:** [Ali Zolfaghari](https://github.com/Ali-Zolfaghari70)
- **Universität:** [FH Joanneum](https://www.fh-joanneum.at/)


## Logging-Konfiguration

Für das Logging wird Apache Log4J2 verwendet. Die Konfigurationsdatei (`log4j2.xml`) wird **nicht** mitversioniert. Bitte folgende Schritte beachten:

1. Kopiere `log4j2.xml.template` nach `src/main/resources/log4j2.xml`
2. Stelle sicher, dass das Verzeichnis `logs/` vorhanden ist
3. Log-Ausgaben erscheinen in `logs/myapp.log` sowie in der Konsole

Weitere Informationen zur Konfiguration befinden sich in der Datei [exercise5.md](./exercise5.md).



[Template der log4j2.xml Datei](src/main/resources/log4j2.xml.template)
     

## Wie die log4j2.xml Datei aussieht (Template)



```
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
 <Appenders>
 <!-- Ausgabe auf Konsole -->
 <Console name="Console" target="SYSTEM_OUT">
 <PatternLayout pattern="%d{HH:mm:ss} [%t] %-5level %logger{36}
- %msg%n" />
 </Console>
 <!-- Logdatei-Ausgabe -->
 <File name="FileLogger" fileName="logs/app.log" append="true">
 <PatternLayout>
 <pattern>%d{yyyy-MM-dd HH:mm:ss} %-5level %c{1} -
%msg%n</pattern>
 </PatternLayout>
 </File>
 </Appenders>
 <Loggers>
 <!-- Root Logger -->
 <Root level="debug">
 <AppenderRef ref="Console"/>
 <AppenderRef ref="FileLogger"/>
 </Root>
 </Loggers>
</Configuration>
```

<h3>Das Resultat:</h3>

```
2025-04-03 14:03:50 INFO  Calculator -
divide called with: number1 =10.0, number2 =0.0
2025-04-03 14:03:50 ERROR Calculator -
Division called with 0!

...
```
Es liefert die Lognachrichten in die app.log Datei, wobei wenn man die Test noch mal ausführt die Datei nicht überschriben wird sondern es zu ihr angesetzt wird (**append**)