public abstract class BuildingCard extends Card{
    //Data members
    protected int health, lifetime;

    //constructors
    BuildingCard() {}	//default constructor

    //Six-Parameter constructor
    BuildingCard(String nm, int ec, String r, String t, int h, int lftm) {
        super(nm,ec,r,t);
        health = h;
        lifetime = lftm;
    }

    //Methods to display results of card interactions/fights

    //building card vs troop card
    public void faceOff(TroopCard y) {
        String displayMsg;  //to store final message displayed to user

        //calculate how much time it would take for each card to kill the other
        double x_TimeToKill = y.health / this.getDamagePerSec();    //x - referring to the friendly card (the object on which the method is being called)
        double y_TimeToKill = this.health / y.getDamagePerSec();    //y - referring to the enemy card (the object sent to the method as a parameter)

        //The card which took less time to kill the other is deemed the winner of this interaction
        displayMsg = x_TimeToKill < y_TimeToKill ? (this.name + " wins this interaction against " + y.name + "!") : (y.name + " wins this interaction against " + this.name + "!");
        System.out.println(displayMsg);
    }

    //building card vs spell card
    public void faceOff(SpellCard y) {
        String displayMsg;  //to store final message displayed to user

        int spellTotDmg = 0;    //variable to store the total damage of the SpellCard object sent to this method

        if (y.getClass() == SingleStrikeSpell.class) {      //check if object is of single strike spell or lasting spell type
            spellTotDmg = ((SingleStrikeSpell)y).damage;    //return damage attribute of the single strike spell, as it deals a one time, instantaneous attack
        }
        else if (y.getClass() == LastingSpell.class){
            spellTotDmg = ((LastingSpell) y).getTotalDamage();      //invoke getTotalDamage method to compute the total damage of the lasting spell
        }

        //if spell's total damage is more than that of the health of the building, then spell wins interaction, and vice versa
        displayMsg = this.health < spellTotDmg ? (y.name + " kills " + this.name + "!") : (this.name + " survives " + y.name + "!");
        System.out.println(displayMsg);
    }

    //building card vs building card
    public void faceOff(BuildingCard y) {
        String displayMsg;  //to store final message displayed to user

        //calculate how much time it would take for each card to kill the other
        double x_TimeToKill = y.health / this.getDamagePerSec();    //x - referring to the friendly card (the object on which the method is being called)
        double y_TimeToKill = this.health / y.getDamagePerSec();    //y - referring to the enemy card (the object sent to the method as a parameter)

        //The card which took less time to kill the other is deemed the winner of this interaction
        displayMsg = x_TimeToKill < y_TimeToKill ? (this.name + " wins the interaction against " + y.name + "!") : (y.name + " wins the interaction against " + this.name + "!");
        System.out.println(displayMsg);
    }
}
