# Übung 05: Logging mit Log4J2

## Warum werden Logging-Bibliotheken verwendet?

Logging-Bibliotheken wie Log4J ermöglichen die strukturierte Ausgabe von Informationen über den Ablauf eines Programms. Sie helfen beim Debugging, bei der Fehleranalyse und beim Monitoring in Produktivsystemen. Vorteile gegenüber `System.out.println()` sind:
- **Loglevel-Steuerung**
- **Flexible Konfiguration (Datei, Konsole, etc.)**
- **Zentrale Steuerung des Logverhaltens**
- **Filterung und Formatierung**

---

## Welche Loglevel gibt es in Log4J2?

| Loglevel | Beschreibung |
|----------|--------------|
| `TRACE`  | Sehr detaillierte Debug-Informationen, z.B. jede Methode/Aktion |
| `DEBUG`  | Informationen für Entwickler zur Fehleranalyse |
| `INFO`   | Allgemeine Informationen über Programmablauf |
| `ERROR`  | Fehler, bei denen das Programm weiterläuft |
stabil ist |

---

## Welche Konfigurationsmöglichkeiten bietet Log4J2?

Log4J2 bietet viele Konfigurationsoptionen, u.a.:

- **Appenders**: Bestimmt, wo Logs ausgegeben werden (Konsole, Datei, Datenbank)
- **Layouts**: Formatierung der Logeinträge (z. B. Datum, Thread, Nachricht)
- **Logger Levels**: Definiert, ab welchem Schweregrad Logs erscheinen
- **Log Rotation & Archivierung**: Automatisches Rotieren von Logdateien
- **Asynchrone Logs**: Für performantes Logging

---

## Hinweis zur Konfigurationsdatei

Bitte kopiere und benenne die Datei `log4j2.xml.template` in `log4j2.xml`, und lege sie in den Ordner `src/main/resources/`. Passe bei Bedarf Pfade und Loglevel an.

