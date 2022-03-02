package equipment.skills;

import equipment.Equipment;
import tournament.Fighter;

public abstract class Skill implements Equipment {
	
	String equimentType = "Skill";
	String name;
	
	public String GetType() {
		return 	equimentType;	
	}
	
	public String GetName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int skillDmgModifier(Fighter fighter) {
		return 1;
		
	}
	
}
