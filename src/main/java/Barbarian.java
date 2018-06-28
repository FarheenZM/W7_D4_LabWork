public class Barbarian extends Player {

    public Barbarian(String name, int healthValue) {
        super(name, healthValue);
    }

    public void fight(Player player, AttackingTool attackingTool) {
        player.setHealthValue(player.getHealthValue() - attackingTool.getDamageValue());
    }
}
