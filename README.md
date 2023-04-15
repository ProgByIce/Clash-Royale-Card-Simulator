# Clash-Royale-Card-Simulator
Task:
Create a Java program that simulates the card hierarchy and battle system of the mobile game, Clash Royale.

Solution Description: 

1. Create a class hierarchy that represents Clash Royale's in-game card hierarchy: Cards are separated into troops, spells, and buildings. Troops are separated into melee and ranged troops. Spells are separated into single strike and lasting spells. Buildings are of one type, defensive buildings. The inheritance scheme that I will implement in the Java program will be, understandably, hierarchical inheritance. 

2. Each inheriting class will implement new, distinct attributes and methods where necessary. 

3. The parent class Card will be an abstract class, containing an abstract method called GetDamagePerSec. This function will be overridden in the child classes of Card, to calculate the damage per second of each corresponding card type. 

4. Subclasses of Card will implement an Information interface, which will have a method that displays a description of the card type. 

5. Subclasses of Card will implement a method to simulate a duel between two cards. This method will take two card instances as parameters and calculate which card perishes first (through a simple equation using one card health and card DPS). Finally, the method will display a victory message for the card which wins the interaction. 
