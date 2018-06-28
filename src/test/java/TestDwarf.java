import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDwarf {

    Dwarf dwarf;
    AttackingTool tool;

    @Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Daloggoid Warmpike", 500);
        tool = new AttackingTool("weapon", "Abyss Hammer", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Daloggoid Warmpike", dwarf.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(500, dwarf.getHealthValue());
    }

    @Test
    public void hasWeapon() {
        dwarf.addTool(tool);
        assertEquals(1, dwarf.countAttackingTools());
    }

    @Test
    public void canDisappear() {
        assertEquals(2, dwarf.getDisappear());
    }
}
