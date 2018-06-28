import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDwarf {

    Dwarf dwarf1;
    AttackingTool tool;
    Dwarf dwarf2;
    Warlock warlock;

    @Before
    public void setUp() throws Exception {
        dwarf1 = new Dwarf("Daloggoid Warmpike", 500);
        tool = new AttackingTool("weapon", "Abyss Hammer", 100);
        dwarf2 = new Dwarf("Daloggoid2", 500);
        warlock = new Warlock("Naerius Ashes", 700);
    }

    @Test
    public void hasName() {
        assertEquals("Daloggoid Warmpike", dwarf1.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(500, dwarf1.getHealthValue());
    }

    @Test
    public void hasWeapon() {
        dwarf1.addTool(tool);
        assertEquals(1, dwarf1.countAttackingTools());
    }

    @Test
    public void canDisappear() {
        assertEquals(2, dwarf1.getDisappear());
    }

    @Test
    public void canTakeAwayHealthPoints() {
        dwarf1.addTool(tool);
        dwarf1.fight(warlock, tool);
        assertEquals(600, warlock.getHealthValue());
    }

    @Test
    public void canFight() {
        dwarf1.addTool(tool);
        dwarf1.fight(warlock, tool);
        assertEquals(600, warlock.getHealthValue());
    }

    @Test
    public void testFightWithDwarf() {
        dwarf2.addTool(tool);
        dwarf2.fightWithDwarf(dwarf1, tool);
        assertEquals(500, dwarf1.getHealthValue());
    }
}
