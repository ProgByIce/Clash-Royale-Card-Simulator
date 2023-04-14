public class LastingSpell extends SpellCard implements Info{
    //data members
    double hitSpeed,	//the intervals at which the spell deals damage
            duration;

    //Constructors
    LastingSpell() {};		//Default constructor

    //Eight-Parameter constructor
    LastingSpell(String nm, int ec, String r, String t, int dmg, double rds, double hs, double drtn) {
        super(nm,ec,r,t,dmg,rds);
        hitSpeed = hs;
        duration = drtn;
    };

    //methods
    @Override
    int getDamagePerSec() {
        return (int)Math.floor(damage/hitSpeed);
    }


    int getTotalDamage(){       //method that returns the total, overall damage dealt by this lasting spell
        return (int)(this.getDamagePerSec()*duration);
    }

    @Override
    public void describeCardType() {
        System.out.println("I am a spell card that deals prolonged damage in an effective area. Once my effect runs out, I no longer pose a threat. You can use me against enemy troops or buildings!");
    }
}
