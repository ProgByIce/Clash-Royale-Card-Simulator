/*
* Hristian Yankulov
* Task: Create a java program emulating the card hierarchy system of the mobile strategy game, Clash Royale
* This is the driver program displaying several program functionalities
*/

public class Driver {
    public static void main(String[] args) {

        //Examples of hard-coded data, declaring and initializing card objects
        SingleStrikeSpell zap = new SingleStrikeSpell("Zap", 2, "Common", "Air & Ground", 192, 2.5);
        SingleStrikeSpell fireball = new SingleStrikeSpell("Fireball", 4, "Rare", "Air & Ground", 689, 2.5);
        SingleStrikeSpell rocket = new SingleStrikeSpell("Rocket", 3, "Rare", "Air & Ground", 1484, 2);

        LastingSpell poison = new LastingSpell("Poison", 4, "Epic", "Air & Ground", 83, 3.5, 1, 8);
        LastingSpell earthquake = new LastingSpell("Earthquake", 3, "Rare", "Ground", 75, 3.5, 0.8, 3);

        MeleeTroop knight = new MeleeTroop("Knight", 3, "Common", "Ground", 1666, 202, 1.2, "Medium");
        MeleeTroop bandit = new MeleeTroop("Bandit", 3, "Legendary", "Ground", 907, 193, 1, "Fast");
        MeleeTroop miniPekka = new MeleeTroop("Mini P.E.K.K.A.", 4, "Rare", "Ground", 1361, 720, 1.6, "Fast");

        RangedTroop princess = new RangedTroop("Princess", 3, "Legendary", "Air & Ground", 261, 169, 3, "Medium", 9);
        RangedTroop sparky = new RangedTroop("Sparky", 6, "Legendary", "Ground", 1452, 1331, 4, "Slow", 5);
        RangedTroop musketeer = new RangedTroop("Musketeer", 4, "Rare", "Air & Ground", 720, 218, 1, "Medium", 6);

        DefenseBuilding xBow = new DefenseBuilding("X-Bow", 6, "Epic", "Ground", 1600, 30, 41, 0.3, 11.5);
        DefenseBuilding cannon = new DefenseBuilding("Cannon", 3, "Common", "Ground", 896, 30, 212, 0.9, 5.5);
        DefenseBuilding hiddenTesla = new DefenseBuilding("Hidden Tesla", 4, "Common", "Air & Ground", 1152, 30, 230, 1.2, 5.5);

        //sample card interactions
        sparky.faceOff(hiddenTesla);
        bandit.faceOff(musketeer);
        xBow.faceOff(miniPekka);
        rocket.faceOff(cannon);
        poison.faceOff(princess);

        //sample card descriptions
        zap.describeCardType();
        earthquake.describeCardType();
        knight.describeCardType();
        musketeer.describeCardType();
        cannon.describeCardType();

        //sample use of toString method
        System.out.println(fireball.toString());
        System.out.println(sparky.toString());

        //sample getDamagePerSec method
        System.out.println("Damage per second of " + princess.getName() + ": " + princess.getDamagePerSec());
    }
}
