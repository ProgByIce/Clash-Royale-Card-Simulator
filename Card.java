public abstract class Card {
    //Data members
    protected String name, rarity, target;
    protected int elixirCost;

    //Constructors
    Card() {};				//Default Constructor

    //Four-Parameter constructor
    Card(String nm, int ec, String r, String t){
        name = nm;
        elixirCost = ec;
        rarity = r;
        target = t;
    };


    //Methods
    abstract int getDamagePerSec();		//abstract function getDamagePerSec
                                        //to be overridden in child classes, where it will calculate the
    									//damage per second that a card deals (value rounded down to the closest integer)

    //override toString method to return vital card information
    @Override
    public String toString(){
        return("Name: " + name +
                "\nRarity: " + rarity +
                "\nElixir Cost: " + elixirCost +
                "\nTarget: " + target);
    }

    //setters
    void setName(String s){
        name = s;
    }

    void setElixirCost(int n){
        elixirCost = n;
    }

    void setRarity(String s){
        rarity = s;
    }

    void setTarget(String s){
        target = s;
    }

    //getters
    String getName() {
        return name;
    }

    int getElixirCost() {
        return elixirCost;
    }

    String getRarity() {
        return rarity;
    }

    String getTarget(){
        return target;
    }
}
