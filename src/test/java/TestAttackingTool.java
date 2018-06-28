import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAttackingTool {

    AttackingTool tool1;
    AttackingTool tool2;

    @Before
    public void setUp() throws Exception {
        tool1 = new AttackingTool("weapon", "Skewer of the sky", 100);
        tool2 = new AttackingTool("spell", "Air Blitz", 250);
     }

    @Test
    public void testType() {
        assertEquals("weapon", tool1.getType());
    }

    @Test
    public void testName() {
        assertEquals("Air Blitz", tool2.getName());
    }

    @Test
    public void testDamageValue() {
        assertEquals(100, tool1.getDamageValue());
    }
}
