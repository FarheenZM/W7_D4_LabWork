import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreature {
    Creature creature1;
    Creature creature2;

    @Before
    public void setUp() throws Exception {
        creature1 = new Creature("Ogre", "Krork", 50 );
        creature2 = new Creature("Dragon", "Drogon", 200 );
    }

    @Test
    public void hasType() {
        assertEquals("Ogre", creature1.getType());
    }

    @Test
    public void hasName() {
        assertEquals("Krork", creature1.getName());
    }

    @Test
    public void hasDefendPoints() {
        assertEquals(200, creature2.getDefendPoints());
    }
}
