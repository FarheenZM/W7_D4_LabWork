public class AttackingTool {

    private String type;
    private String name;
    private int damageValue;

    public AttackingTool(String type, String name, int damageValue) {
        this.type = type;
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
