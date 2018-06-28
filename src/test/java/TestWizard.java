import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWizard {
    Wizard wizard1;
    Wizard wizard2;
    Creature creature;
    AttackingTool tool;
    Barbarian barbarian;

    @Before
    public void setUp() throws Exception {
        wizard1 = new Wizard("Dumbledore", 600);
        wizard2 = new Wizard("Voldemort", 600);
        creature = new Creature("Ogre", "Krork", 50);
        tool = new AttackingTool("Spell", "Sectumsempra", 300);
        barbarian = new Barbarian("Onwolf", 800);
    }

    @Test
    public void hasName() {
        assertEquals("Dumbledore", wizard1.getName());
    }

    @Test
    public void hasHeathValue() {
        assertEquals(600, wizard1.getHealthValue());
    }

    @Test
    public void hasSpell() {
        wizard1.addTool(tool);
        assertEquals(1, wizard1.countAttackingTools());
    }

    @Test
    public void canAddCreature() {
        wizard1.addCreature(creature);
        assertEquals(1, wizard1.getCreatures().size());
    }

    @Test
    public void canRemoveCreature() {
        wizard1.addCreature(creature);
        wizard2.stealCreature(wizard1);
        assertEquals(0, wizard1.getCreatures().size());

    }

    @Test
    public void canStealCreature() {
        wizard1.addCreature(creature);
        wizard2.stealCreature(wizard1);
        assertEquals(1, wizard2.getCreatures().size());
    }

    @Test
    public void canFight() {
        wizard1.addTool(tool);
        wizard1.fight(barbarian, tool);
        assertEquals(500, barbarian.getHealthValue());
    }
}
