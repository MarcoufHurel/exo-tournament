package tournament;

import equipment.Equipment;
import equipment.armor.Armor;
import equipment.shields.*;
import equipment.skills.Skill;
import equipment.weapons.*;
import factory.EquipmentFactory;

/** base for all different fighter implementation */
public abstract class Fighter {

	int hp,maxHp;
	Weapon weapon;
	Shield shield;
	Armor armor;
	String name;
	int round=1;
	Skill skill;
	
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
			System.out.println("tour " + round + " " +  name + " " + hp + " "+ ennemy.getName() + " " + ennemy.hitPoints());
			round++;
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
		//System.out.println(name + " attack " + ennemy.getName());
		weapon.hit();
		ennemy.getHit(this);
	
	}
	
	/** Receives a blow */
	public void getHit (Fighter ennemi) {
		int damageTaken=0;
		
		if(ennemi.getModifiedDmg()>0) {
			if(shield != null) {
				damageTaken+=shield.getHit(ennemi);
			} else {
				damageTaken+=ennemi.getModifiedDmg();
			}
			
			if(armor != null) {
				damageTaken-=armor.getDamageReduction();
			}
		}
		if(damageTaken<=0) {
			damageTaken=0;
		}
		//System.out.println(name + " take " + damageTaken);
		
		hp -= damageTaken;
		//System.out.println(name + " HP " + hp);
		
	}
	
	/** Show HP (negative HP will be shown as 0 */
	public int  hitPoints () {
		if(hp < 0) return 0;
		else return hp;
	}
	
	/** Equip the specified item */
	public void setEquipment(String equipmentType) {
		System.out.println(name + " equip " + equipmentType);
		
		EquipmentFactory factory = new EquipmentFactory();
		Equipment equipment = factory.create(equipmentType);
		
		if(equipment != null) {
			if(equipment.GetType().equalsIgnoreCase("Weapon")) {
				weapon=(Weapon) equipment;			
			} else if(equipment.GetType().equalsIgnoreCase("Shield")) {
				shield=(Shield) equipment;			
			} else if(equipment.GetType().equalsIgnoreCase("Armor")) {
				armor=(Armor) equipment;			
			} else if(equipment.GetType().equalsIgnoreCase("Skill")) {
				skill=(Skill) equipment;			
			}
		}
		
	}
	
	public Fighter equip(String equipmentType) {
		this.setEquipment(equipmentType);
		return this;
	}
	
	/** return the damage that the fighter can deliver this round */
	public int getDmg() {
		int dmg=0;
		
		if(weapon != null) {
			dmg=weapon.getDmg();
		}
		if(armor != null) {
			dmg -= armor.getDamageDoneReduction();
		}
		if(dmg<=0) {
			dmg=0;
		}
		
		//System.out.println(name + " inflict " + dmg + " damages");
		
		return dmg;
	}
	
	/** return the damage that the fighter can deliver this round with skill modification */
	public int getModifiedDmg() {
		int dmg=getDmg();
		
		if(skill != null) {
			dmg=skill.skillDmgModifier(this);
		}

		//System.out.println(name + " inflict " + dmg + " damages");
		
		return dmg;
	}
	
	public Weapon getWeapon () {
		return weapon;
	}
	
	public Armor getArmor () {
		return armor;
	}
	
	public Shield getShield () {
		return shield;
	}
	
	/** define hp at initialization*/
	public void setHp(int hp) {
		this.maxHp=hp;
		this.hp=hp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}
}
