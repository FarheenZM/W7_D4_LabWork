import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthValue;
    private ArrayList<AttackingTool> attackingTools;

    public Player(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackingTools = new ArrayList<AttackingTool>();
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public ArrayList<AttackingTool> getAttackingTools() {
        return attackingTools;
    }
}