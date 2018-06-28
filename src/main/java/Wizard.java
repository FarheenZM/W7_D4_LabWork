import java.util.ArrayList;

public class Wizard extends Player {
    private ArrayList<Creature> creatures;
    public Wizard(String name, int healthValue) {
        super(name, healthValue);
        creatures = new ArrayList<Creature>();
    }
}
