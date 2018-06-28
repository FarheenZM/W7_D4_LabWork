import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCleric {
    Cleric cleric;
    HealingTool tool1;

    @Before
    public void before(){
        cleric = new Cleric("Brurstor Threestone");
        tool1 = new HealingTool("Invigorate", 70);
    }

    @Test
    public void canGetName(){
        assertEquals("Brurstor Threestone", cleric.getName());
    }

    @Test
    public void canCountTools(){
        assertEquals(0, cleric.countTools());
    }

    @Test
    public void canAddHealingTool(){
        cleric.addTool(tool1);
        assertEquals(1, cleric.countTools());}

}