public class HealingTool {
    private String name;
    private int healingValue;

    public HealingTool(String name, int healingValue){
        this.name = name;
        this.healingValue = healingValue;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.healingValue;
    }
}