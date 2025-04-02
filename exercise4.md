# **Übung: JUnit-Tests und Testabdeckung**

## **1. Ziel der Übung**
Diese Übung umfasst die Erstellung von Unit-Tests für eine Taschenrechner-Klasse (`Calculator`) mit JUnit sowie die Überprüfung der Testabdeckung.

## **2. Vorgehensweise**
1. **JUnit-Teststruktur nutzen:** Given-When-Then-Prinzip anwenden.
2. **Testfälle für die Grundrechenarten implementieren:**
   - Addition, Subtraktion, Multiplikation, Division.
   - Sonderfälle wie Division durch 0 testen.
3. **SetUp-Methoden verwenden:** `@BeforeEach` zur Initialisierung der `Calculator`-Instanz.
4. **Testabdeckung prüfen:** Mit "Run with Coverage" ausführen und Screenshot speichern.
5. **Fakultätsfunktion (`factorial`) mit TDD entwickeln:**
   - Tests zuerst schreiben.
   - Funktion mit Platzhalter (`return 0;`) erstellen.
   - Tests ausführen (Fehler erwartet).
   - Richtige Implementierung ergänzen.
   - Tests erneut ausführen.
6. **Projekt mit Maven testen:** `mvn test` in der Konsole ausführen.
7. **Versionierung:** Projekt nach erfolgreichem Testen committen und pushen.

## **3. Erwartete Ergebnisse**
- Alle Tests erfolgreich bestanden.
- Hohe Testabdeckung.
- Saubere Code-Struktur durch TDD.

## **4. Abgabe**
- Testklasse mit allen Testfällen.
- Screenshot der Testabdeckung (`ex4_1.png`).
![Screenshot der Testabdeckung](resources/images/ex4_1.PNG)
- Screenshot der fehlschlagenden Tests (`ex4_2.png`).
![Screenshot der fehlschlagenden Tests](resources/images/ex4_2.PNG)
- Versioniertes Projekt auf GitHub/Repository hochgeladen.

