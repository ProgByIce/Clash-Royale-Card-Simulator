public class MeleeTroop extends TroopCard implements Info{
    //Constructors
    MeleeTroop() {}	//default constructor

    //Eight - Parameter constructor
    MeleeTroop(String nm, int ec, String r, String t, int h, int d, double hs, String ms) {
        super(nm,ec,r,t,h,d,hs,ms);
    }

    //methods
    @Override
    int getDamagePerSec() {
        return (int)Math.floor(damage/hitSpeed);    //damage over hit speed returns the damage dealt per second
    }

    @Override
    public void describeCardType() {
        System.out.println("I am a troop card that deals damage through melee attacks. You can use me to fight against enemy troops or buildings!");
    }
}
