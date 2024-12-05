# Vehicle Rental System

## Beskrivning
Vehicle Rental System är en Java-applikation som simulerar en uthyrningstjänst för fordon. Systemet är byggt för att vara enkelt att använda och hanterar uthyrning och återlämning av flera fordonstyper som bilar, SUV:ar, lastbilar och cabrioleter.

Applikationen använder objektorienterade principer, inklusive arv, inkapsling och interface, för att säkerställa en robust och skalbar lösning.

---

## Funktioner

- **Visa tillgängliga fordon**: Användaren kan se en lista över fordon med modell, registreringsnummer och hyrespris.
- **Hyra ett fordon**: Användaren kan välja ett fordon att hyra och ange antalet hyresdagar.
- **Returnera ett fordon**: Användaren returnerar ett fordon och får en beräkning av den totala hyreskostnaden.
- **Fordonstyper**:
    - **Car**: Inkluderar information om bilen är elektrisk.
    - **SUV**: Har stöd för fyrhjulsdrift.
    - **Truck**: Kan inkludera ett släp.
    - **Convertible**: Visar antal säten.

---

## Teknisk Design

### **Klassindelning**
1. **Vehicle** *(abstrakt klass)*:
    - Attribut: Modell, registreringsnummer, hyrespris.
    - Metoder: `rent(int days)`, `returnVehicle()`, `rentCost()`.
2. **Subklasser**:
    - `Car`: Har attribut för elektrisk status.
    - `SUV`: Hanterar fyrhjulsdrift.
    - `Truck`: Inkluderar släpattribut.
    - `Convertible`: Hanterar antal säten.
3. **Rentable** *(interface)*:
    - Definierar standardmetoder för uthyrning och återlämning.
4. **UserInterface**:
    - Hanterar användarinteraktion via en meny.

---

## Installation och Körning

### **Krav**
- Java Development Kit (JDK) version 8 eller senare.
- En IDE (t.ex. IntelliJ IDEA, Eclipse) eller kommandoradsverktyg.

### **Steg för att köra**
1. Klona eller ladda ner projektet och öppna upp med en IDE.
2. Navigera till Application klassen.
3. Kör Applikationen.
