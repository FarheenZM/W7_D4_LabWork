public class Knight extends Player{
    private int armourValue;

    public Knight(String name, int healthValue) {

        super(name, healthValue);

        this.armourValue = 50;
    }

    public int getArmourValue() {
        return armourValue;
    }
}
