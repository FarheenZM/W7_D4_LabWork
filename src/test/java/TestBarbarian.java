import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBarbarian {
    
    Barbarian barbarian;
    AttackingTool tool1;
    AttackingTool tool2;

    @Before
    public void setUp() throws Exception {
        barbarian = new Barbarian("Onwolf", 800);
        tool1 = new AttackingTool("weapon", "Axe", 200);
        tool2 = new AttackingTool("weapon", "Axe", 200);
    }

    @Test
    public void hasName() {
        assertEquals("Onwolf", barbarian.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(800, barbarian.getHealthValue());
    }

    @Test
    public void hasWeapon() {
        barbarian.addTool(tool1);
        assertEquals(1, barbarian.countAttackingTools());
    }

    @Test
    public void countWeapon() {
        barbarian.addTool(tool1);
        barbarian.addTool(tool2);
        assertEquals(2, barbarian.countAttackingTools());
    }
}
