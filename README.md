# Files inlezen

##### Inlezen van Hello.txt
- bekijk het tekstbestand genaamd ```Hello.txt``` dat staat in dit project op hetzelfde niveau als deze README
- schrijf een programma met een main methode dat het text bestand genaamd ```Hello.txt``` in moet lezen en afdrukt in de console.  
  *(tip: gebruik de File library class uit de java.io package en de Scanner library class uit de java.util package. Gebruik een **while-loop** en de methodes **hasNextLine()** en **nextLine()**)* 
- merk op dat je programma niet compileert. De foutmelding is als volgt: *exception java.io.FileNotFoundException; must be caught or declared to be thrown*
- zorg ervoor dat met een *try...catch* constructie de potentiele *FileNotFoundException* afgevangen wordt. Zorg voor een gebruiksvriendelijke foutmelding.
- draai je programma en kijk of het bestand correct wordt uitgelezen  
voorbeeld output:
```bash
Hello World!
Dit is een tekstbestand
```
- verander de naam van het in te lezen bestand in je programma (probeer nu bijvoorbeeld het bestand ```Hello2.txt``` in te lezen)
- draai nogmaals je programma en kijk of de *FileNotFoundException* wordt afgevangen  
voorbeeld output:
```bash
Fout bij inlezen bestand: Hello2.txt (No such file or directory)
``` 

**Extra**
##### gebruik van de throws clausule
- verplaats de code uit bovenstaande opdracht naar een aparte methode genaamd ```static void bestandInlezen(String bestandsNaam)```. Zoals je ziet krijgt deze methode als input de naam van het bestand mee
- verander de code zodat de parameter ```bestandsNaam``` gebruikt wordt om een bestand te openen, i.p.v. dat de bestandsnaam hard gecodeerd in de code staat.
- roep deze methode aan vanuit de main methode en geef de bestandsnaam ```Hello.txt``` mee als parameter 
- draai je programma en kijk of het bestand ```Hello.txt``` correct wordt ingelezen 
- haal nu de *try...catch* constructie weg en voeg de ```throws FileNotFoundException``` clausule toe aan de header van de methode ```bestandInlezen(String bestandsnaam)```  
  De foutmelding *exception java.io.FileNotFoundException; must be caught or declared to be thrown* treedt weer op, maar nu op een andere plek. Waar?
- zorg ervoor dat met een *try...catch* constructie de potentiele *FileNotFoundException* afgevangen wordt op de nieuwe plek waar de fout optreedt. Zorg voor een gebruikersvriendelijke foutmelding.  
- draai je programma en kijk of het bestand correct wordt uitgelezen  
- verander de naam van het in te lezen bestand in je programma (probeer nu bijvoorbeeld het bestand ```Hello2.txt``` in te lezen)
- draai nogmaals je programma en kijk of de *FileNotFoundException* wordt afgevangen 