package tournament;

/**
 * an Highlander as 150 hit points and fight with a Great Sword
 * a Great Sword is a two handed sword deliver 12 damages, but can attack only 2 every 3
 * an armor : reduce all received damages by 3 & reduce delivered damages by one
 */
public class Highlander extends Fighter {
	
	
	
	public Highlander() {
		this.setName("Highlander");
		this.setHp(150);
		this.setEquipment("GreatSword");
	}
	
	@Override
	public Highlander equip(String equipmentType) {
		this.setEquipment(equipmentType);
		return this;
	}
	
	public Highlander(String skill) {
		this.setName("Highlander");
		this.setHp(150);
		this.setEquipment("GreatSword");
		this.setEquipment(skill);
	}

}
