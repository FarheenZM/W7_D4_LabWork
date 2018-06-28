import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWizard {
    Wizard wizard;
    AttackingTool tool;

    @Before
    public void setUp() throws Exception {
        wizard = new Wizard("Dumbledore", 600);
        tool = new AttackingTool("Spell", "Sectumsempra", 300);
    }

    @Test
    public void hasName() {
        assertEquals("Dumbledore", wizard.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(600, wizard.getHealthValue());
    }

    @Test
    public void hasSpell() {
        wizard.addTool(tool);
        assertEquals(1, wizard.countAttackingTools());
    }
}
