
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealingTool {
    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool("Invigorate", 70);
    }

    @Test
    public void canGetName() {
        assertEquals("Invigorate", healingTool.getName());
    }

    @Test
    public void canGetHealingValue() {
        assertEquals(70, healingTool.getValue());
    }

}