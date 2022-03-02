package tournament;

import equipment.Equipment;
import equipment.shields.*;
import equipment.weapons.*;
import factory.EquipmentFactory;

/** base for all different fighter implementation */
public abstract class Fighter {

	int hp;
	Weapon weapon;
	Shield shield;
	String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	/** Attack an ennemy, ennemy will reply until one opponent is dead */
	public void engage (Fighter ennemy) {
		/* while self or ennemy is not dead */
		/*		 hit ennemi */
		/*       if ennemi not dead, ennemi hit self*/
		
		while (!this.isDead()&&!ennemy.isDead()) {
			this.hit(ennemy);
			if(!ennemy.isDead()) {
				ennemy.hit(this);
			}
			
		}
	}
	
	/** Check is self is dead */
	public boolean isDead() {
		if(hp>0) {
			return false;
		} else return true;
	}
	
	/** Give a blow to a fighter */ 
	public void hit (Fighter ennemy) {
		ennemy.getHit(weapon);
	
	}
	
	/** Receives a blow */
	public void getHit (Weapon weapon) {
		System.out.println(name + " is hit");
		if(shield != null) {
			hp-=shield.getHit(weapon);
		} else {
		hp -= weapon.getDmg();
		}
	}
	
	/** Show HP (negative HP will be shown as 0 */
	public int  hitPoints () {
		if(hp < 0) return 0;
		else return hp;
	}
	
	/** Equip the specified item */
	public void setEquipment(String equipmentType) {
		System.out.println("Fighter "+ name + " equip " + equipmentType);
		
		EquipmentFactory factory = new EquipmentFactory();
		Equipment equipment = factory.create(equipmentType);
		
		if(equipment.GetType().equalsIgnoreCase("Weapon")) {
			weapon=(Weapon) equipment;			
		} else if(equipment.GetType().equalsIgnoreCase("Shield")) {
			shield=(Shield) equipment;			
		}
	}
	
	public Fighter equip(String equipmentType) {
		this.setEquipment(equipmentType);
		return this;
	}
}
