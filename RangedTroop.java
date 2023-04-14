public class RangedTroop extends TroopCard implements Info{
    //data members
    double range;

    //constructors
    RangedTroop() {};	//default constructor

    //Nine - Parameter constructor
    RangedTroop(String nm, int ec, String r, String t, int h, int d, double hs, String ms, double rng) {
        super(nm,ec,r,t,h,d,hs,ms);
        range = rng;
    };

    //methods
    @Override
    int getDamagePerSec() {
        return (int)Math.floor(damage/hitSpeed);
    }

    @Override
    public void describeCardType() {
        System.out.println("I am a troop card that deals damage through ranged attacks. You can use me to fight against enemy troops or buildings!");
    }
}
