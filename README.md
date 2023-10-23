# Santander BootCamp 2023
Java project based on UML about Steve Jobs presentation conference iPhone.

## Diagrama de Classes

```mermaid
classDiagram
    class iPhone {
        +powerOn()
        +powerOff()
        -music : Music()
        -phone : Phone()
        -browser : Browser()
    }

    class Music {
        +pauseMusic()
        +selectMusic()
        +playMusic()
    }

    class Phone {
        +callPhone()
        +attendPhone()
    }

    class Browser {
        +viewPage()
        +updatePage()
        +addNewPage()
    }

    iPhone --|> Music
    iPhone --|> Phone
    iPhone --|> Browser
```
