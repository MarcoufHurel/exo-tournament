package equipment.armor;

import equipment.Equipment;

public abstract class Armor implements Equipment {
	
	String equimentType = "Armor";
	String name;
	int damageReduction, damageDoneReduction;
	
	public String GetType() {
		return 	equimentType;	
	}
	
	public String GetName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDamageReduction (int damageReduction) {
		this.damageReduction=damageReduction;
	}
	
	public int getDamageReduction () {
		return damageReduction;
	}

	public void setDamageDoneReduction (int damageDoneReduction) {
		this.damageDoneReduction=damageDoneReduction;
	}
	
	public int getDamageDoneReduction () {
		return damageDoneReduction;
	}
	
}
