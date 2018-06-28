import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDwarf {

    Dwarf dwarf;

    @Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Daloggoid Warmpike", 500);
    }

    @Test
    public void hasName() {
        assertEquals("Daloggoid Warmpike", dwarf.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(500, dwarf.getHealthValue());
    }
}
