import java.util.ArrayList;

public class Wizard extends Player {
    private ArrayList<Creature> creatures;
    public Wizard(String name, int healthValue) {
        super(name, healthValue);
        creatures = new ArrayList<Creature>();
    }

    public void fight(Player player, AttackingTool attackingTool) {
        player.setHealthValue(player.getHealthValue() - attackingTool.getDamageValue());
    }

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public void addCreature(Creature creature){
        creatures.add(creature);
    }

    public Creature removeCreature(){
        return creatures.remove(0);
    }
    public void stealCreature(Wizard wizard1){
        Creature stolenCreature = wizard1.removeCreature();
        this.creatures.add(stolenCreature);
    }
}
