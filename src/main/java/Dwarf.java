public class Dwarf extends Player{

    private int disappear;

    public Dwarf(String name, int healthValue) {
        super(name, healthValue);
        this.disappear = 2;
    }

    public void fight(Player player, AttackingTool attackingTool) {
        player.setHealthValue(player.getHealthValue() - attackingTool.getDamageValue());
    }


    public void fightWithDwarf(Dwarf dwarf, AttackingTool attackingTool) {
        if(this.disappear < 1) {
            dwarf.setHealthValue(dwarf.getHealthValue() - attackingTool.getDamageValue());
        }
        else {
            this.disappear -= 1;
        }
    }

    public int getDisappear() {
        return disappear;
    }
}
