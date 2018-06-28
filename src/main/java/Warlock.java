import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<Creature> creatures;
    public Warlock(String name, int healthValue) {
        super(name, healthValue);
        creatures = new ArrayList<Creature>();
    }
}
