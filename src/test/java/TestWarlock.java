import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWarlock {
    Warlock warlock;
    AttackingTool tool;

    @Before
    public void setUp() throws Exception {
        warlock = new Warlock("Naerius Ashes", 700);
        tool = new AttackingTool("Spell", "Pyro Torrent", 500);
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
}
