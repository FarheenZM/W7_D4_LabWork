import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testknight {

    Knight knight;
    AttackingTool tool;
    Wizard wizard;

    @Before
    public void setUp() throws Exception {
        knight = new Knight("Hicket of the Water", 1000);
        tool = new AttackingTool("weapon", "Sword", 250 );
        wizard = new Wizard("Dumbledore", 600);
    }

    @Test
    public void hasName() {
        assertEquals("Hicket of the Water", knight.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(1000, knight.getHealthValue());
    }

    @Test
    public void hasWeapon() {
        knight.addTool(tool);
        assertEquals(1, knight.countAttackingTools());
    }

    @Test
    public void testArmourValue() {
        assertEquals(50, knight.getArmourValue());
    }

    @Test
    public void canFight() {
        knight.addTool(tool);
        knight.fight(wizard, tool);
        assertEquals(350, wizard.getHealthValue());
    }
}
