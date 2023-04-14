public class DefenseBuilding extends BuildingCard implements Info{
    //Data members
    int damage;
    double hitSpeed, range;

    //constructors
    DefenseBuilding() {};	//default constructor

    //Nine-parameterized constructor
    DefenseBuilding(String nm, int ec, String r, String t, int h, int lftm, int dmg, double hs, double rng) {
        super(nm,ec,r,t,h,lftm);
        damage = dmg;
        hitSpeed = hs;
        range = rng;
    };

    //methods
    @Override
    int getDamagePerSec() {
        return (int)Math.floor(damage/hitSpeed);
    }

    @Override
    public void describeCardType() {
        System.out.println("I am a building card that deals damage through ranged attacks. You can use me to defend against enemy troops or buildings!");
    }
}
