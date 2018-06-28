public class Dwarf extends Player{

    private int disappear;

    public Dwarf(String name, int healthValue) {
        super(name, healthValue);
        disappear = 2;
    }

    public int getDisappear() {
        return disappear;
    }
}
