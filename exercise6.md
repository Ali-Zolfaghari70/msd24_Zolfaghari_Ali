# Übung 6: Maven Site Konfiguration

## Wichtige Konfigurationsaspekte

### Generierung der Maven Site
- Konfiguriere `pom.xml` mit `maven-site-plugin` (Version 3.12.1).
- Erstelle `site.xml` für Menüstruktur.
- Nutze `src/site/markdown/` für Markdown-Dateien.
- Führe `mvn test` und `mvn site` aus.

### Konfiguration von `site.xml`
- Definiert Menü mit Links zu `exercise6.html` und `good_style.html`.
- Legt Projektname und Navigation fest.

### Konfiguration von `pom.xml`
- Enthält Projektname, Beschreibung, Git-URL.
- Listet Entwicklerinformationen.
- Konfiguriert Plugins: `maven-site-plugin`, `javadoc-plugin`, `jacoco-maven-plugin`.