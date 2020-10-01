# Opdrachten
_Oefenen met access modifiers_

Alle opdrachten en stappen staan in dit document beschreven. De opdrachten gaan ervan uit dat je EdHub hebt bestudeerd.

## Opdracht 1
Gegeven:
 * package nl.novi.javaprogrammeren.one
 * MainOne.java
 * Person.java

Voeg de volgende code aan de MainOne klasse toe: `System.out.println(sjaak.getName());`. De code geeft nu een
foutmelding. Pas Person.java aan. Welke drie opties heb je?

## Opdracht 2
Gegeven:
 * package nl.novi.javaprogrammeren.two
 * package nl.novi.javaprogrammeren.two.sub
 * MainTwo.java
 * Phone.java
 
 Voeg de volgende code toe aan MainTwo: `System.out.println(phone.getBrand());`. Wat moet je aanpassen in Phone.java om
 de code te laten werken?
 
## Opdracht 3
_Uitdagend_
Gegeven:
 * package nl.novi.javaprogrammeren.three
 * package nl.novi.javaprogrammeren.three.sub
 * MainThree.java
 * Human.java

Deze opdracht heeft de volgende regels:
 * Je mag geen klasse toevoegen in  package nl.novi.javaprogrammeren.three.sub
 * Je mag Human.java niet aanpassen.
 
Voeg de volgende code toe aan MainThree.java:
```java
        Doctor hans = new Doctor("1");
        System.out.println(hans.getSofiNumber());
```

De code werkt nu niet. Voeg de klasse Doctor toe. Doctor is een subklasse van Human. Pas Human zo aan dat de code in
MainThree gaat werken.

Deze opdracht heeft tips. Probeer het eerst zonder en probeer de opdracht dan één voor één.

## Opdracht 4
_Uitdagend_

Gegeven:
 * package nl.novi.javaprogrammeren.four
 * package nl.novi.javaprogrammeren.four.hidden
 * MainFour.java
 * Inhabitant.java
 * PrisonCell.java
 
Deze opdracht heeft de volgende regel:
 * Je mag niets aanpassen in Inhabitant.java
 
Inhabitant.java heeft een package-private constructor en package-private getters en setters. MainFour.java kan dus geen
Inhabitant object aanmaken, aanpassen en uitlezen. Dit moet allemaal via het PrisonCell object gebeuren.

Succes!
Er zijn weer tips voor deze opdracht.