 import java.util.ArrayList;

    public class Cleric {
        private String name;
        private ArrayList<HealingTool> healingTools;

        public Cleric(String name){
            this.name = name;
            healingTools = new ArrayList<HealingTool>();
        }


        public String getName() {
            return this.name;
        }

        public int countTools() {
            return this.healingTools.size();
        }

        public void addTool(HealingTool healingTool) {
            healingTools.add(healingTool);
        }
    }
