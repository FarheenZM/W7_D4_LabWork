import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWarlock {
    Warlock warlock;
    AttackingTool tool;
    Dwarf dwarf;

    @Before
    public void setUp() throws Exception {
        warlock = new Warlock("Naerius Ashes", 700);
        tool = new AttackingTool("Spell", "Pyro Torrent", 500);
        dwarf = new Dwarf("Daloggoid Warmpike", 500);
    }


    @Test
    public void hasName() {
        assertEquals("Naerius Ashes", warlock.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(700, warlock.getHealthValue());
    }

    @Test
    public void hasSpell() {
        warlock.addTool(tool);
        assertEquals(1, warlock.countAttackingTools());
    }

    @Test
    public void testVanishWeapon() {
        dwarf.addTool(tool);
        warlock.vanishWeapon(dwarf);
        assertEquals(0, dwarf.countAttackingTools());
    }

    @Test
    public void canFight() {
        warlock.addTool(tool);
        warlock.fight(dwarf, tool);
        assertEquals(0, dwarf.getHealthValue());
    }
}
