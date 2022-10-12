import java.util.ArrayList;

public class Player {

    String name;
    int points;
    ArrayList<Dice> dice = new ArrayList<Dice>();

    public Player(String name) {
        this.name = name;
    }
    public void rollDice(){

    }
    public int getDieValue(){

    }
    public void increaseScore(){

    }
    public void addDie(int sides){

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Dice> getDice() {
        return dice;
    }
}
