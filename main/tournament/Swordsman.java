package tournament;

/** A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg */
public class Swordsman extends Fighter {
	
	public Swordsman() {
		this.setName("Swordsman");
		hp=100;
		this.setEquipment("OneHandSword");
		
	}
	
	@Override
	public Swordsman equip(String equipmentType) {
		this.setEquipment(equipmentType);
		return this;
	}

}
