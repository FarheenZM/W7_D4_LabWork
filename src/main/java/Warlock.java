import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<Creature> creatures;
    public Warlock(String name, int healthValue) {
        super(name, healthValue);
        creatures = new ArrayList<Creature>();
    }

    public void fight(Player player, AttackingTool attackingTool) {
        player.setHealthValue(player.getHealthValue() - attackingTool.getDamageValue());
    }

    public void vanishWeapon(Player player){
        player.removeWeapons();
    }
}
