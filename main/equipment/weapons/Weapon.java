package equipment.weapons;

import equipment.Equipment;

public abstract class Weapon implements Equipment {

	int dmg;
	boolean canBreakShield=false;
	String equimentType = "Weapon";
	String name;
	
	public void setDmg(int dmg) {
		this.dmg=dmg;
	}
	
	public int getDmg() {
		return dmg;
	}
	
	public String GetType() {
		return 	equimentType;	
	}
	
	public String GetName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public boolean getCanBreakShield() {
		return canBreakShield;
	}
	
	public void setCanBreakShield (boolean canBreakShield) {
		this.canBreakShield=canBreakShield;
	}
}
