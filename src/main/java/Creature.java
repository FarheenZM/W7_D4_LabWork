public class Creature {
    private String type;
    private String name;
    private int defendPoints;

    public Creature(String type, String name, int defendPoints) {
        this.type = type;
        this.name = name;
        this.defendPoints = defendPoints;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDefendPoints() {
        return defendPoints;
    }
}
