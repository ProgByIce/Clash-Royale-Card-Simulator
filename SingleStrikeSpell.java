public class SingleStrikeSpell extends SpellCard implements Info{
    //Constructors
    SingleStrikeSpell() {};		//Default constructor

    //Six-Parameter constructor
    SingleStrikeSpell(String nm, int ec, String r, String t, int dmg,double rds) {
        super(nm,ec,r,t,dmg,rds);
    };

    //methods
    @Override
    int getDamagePerSec() {
        return damage;      //simply return the damage, as this spell deals a one time, immediate attack
    };

    @Override
    public void describeCardType() {
        System.out.println("I am a spell card that deals immediate damage upon impact. You can use me against enemy troops or buildings!");
    }
}
