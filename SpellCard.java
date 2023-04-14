public abstract class SpellCard extends Card{
    //Data members
    protected int damage;
    protected double radius;

    //constructors
    SpellCard() {}		//Default constructor

    //Six-Parameter constructor
    SpellCard(String nm, int ec, String r, String t, int dmg, double rds) {
        super(nm,ec,r,t);
        damage = dmg;
        radius = rds;
    }

    //Methods to display results of card interactions/fights

    //spell card vs troop card
    public void faceOff(TroopCard y) {
        String displayMsg;  //to store final message displayed to user

        int spellTotDmg = 0;    //variable to store the total damage of the SpellCard object sent to this method

        if (this.getClass() == SingleStrikeSpell.class) {      //check if object is of single strike spell or lasting spell type
            spellTotDmg = ((SingleStrikeSpell) this).damage;    //return damage attribute of the single strike spell, as it deals a one time, instantaneous attack
        }
        else if (this.getClass() == LastingSpell.class){
            spellTotDmg = ((LastingSpell) this).getTotalDamage();      //invoke getTotalDamage method to compute the total damage of the lasting spell
        }

        //if spell's total damage is more than that of the health of the troop, then spell wins interaction, and vice versa
        displayMsg = y.health < spellTotDmg ? (this.name + " kills " + y.name + "!") : (y.name + " survives " + this.name + "!");
        System.out.println(displayMsg);
    }

    //no spell card vs spell card interactions, as these cards only deal damage, without possessing health

    //spell card vs building card
    public void faceOff(BuildingCard y) {
        String displayMsg;  //to store final message displayed to user

        int spellTotDmg = 0;    //variable to store the total damage of the SpellCard object sent to this method

        if (this.getClass() == SingleStrikeSpell.class) {      //check if object is of single strike spell or lasting spell type
            spellTotDmg = ((SingleStrikeSpell) this).damage;    //return damage attribute of the single strike spell, as it deals a one time, instantaneous attack
        }
        else if (this.getClass() == LastingSpell.class){
            spellTotDmg = ((LastingSpell) this).getTotalDamage();      //invoke getTotalDamage method to compute the total damage of the lasting spell
        }

        //if spell's total damage is more than that of the health of the building, then spell wins interaction, and vice versa
        displayMsg = y.health < spellTotDmg ? (this.name + " kills " + y.name + "!") : (y.name + " survives " + this.name + "!");
        System.out.println(displayMsg);
    }
}
