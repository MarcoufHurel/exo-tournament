package tournament;


/** A Viking has 120 hit points and use a 1 hand axe that does 6 dmg */
public class Viking extends Fighter {
	
	public Viking() {
		this.setName("Viking");
		hp=120;
		this.setEquipment("OneHandAxe");
		
	}
	
	@Override
	public Viking equip(String equipmentType) {
		this.setEquipment(equipmentType);
		return this;
	}
}