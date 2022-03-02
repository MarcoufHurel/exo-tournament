package equipment.skills;

import tournament.Fighter;

/**
 * a vicious Swordsman is a Swordsman that put poison on his weapon.
 * poison add 20 damages on two first blows
 */

public class Vicious extends Skill {

	int numberOfBlow =2;
	int addedDmg = 20;
	
	public Vicious () {
		this.setName("Vicious");
	}
	
	@Override
	public int skillDmgModifier(Fighter fighter) {
		
		if(fighter.getWeapon().getHitCount()<=numberOfBlow) {
			return fighter.getDmg()+addedDmg;
		} else {
			return fighter.getDmg();
		}

		
	}
}
