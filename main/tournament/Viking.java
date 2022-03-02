package tournament;


/** A Viking has 120 hit points and use a 1 hand axe that does 6 dmg */
public class Viking extends Fighter {
	
	public Viking() {
		this.setName("Viking");
		this.setHp(120);
		this.setEquipment("OneHandAxe");
		
	}
	
	@Override
	public Viking equip(String equipmentType) {
		this.setEquipment(equipmentType);
		return this;
	}
	
	public Viking(String skill) {
		this.setName("Swordsman");
		this.setHp(120);
		this.setEquipment("OneHandAxe");
		this.setEquipment(skill);
	}
}