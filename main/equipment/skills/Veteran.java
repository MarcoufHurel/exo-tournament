package equipment.skills;

import tournament.Fighter;

/**
 * a veteran Highlander goes Berserk once his hit points are under 30% of his initial total
 * once Berserk, he doubles his damages
 */
public class Veteran extends Skill {
	
	int hpThreshold = 30;
	int modifier = 2;
	
	public Veteran() {
		this.setName("Veteran");
	}
	
	@Override
	public int skillDmgModifier(Fighter fighter) {
		if(fighter.hitPoints()<=(fighter.getMaxHp()*hpThreshold/100)) {
			System.out.println("Go Berserk");
			return fighter.getDmg()*modifier;
		} else {
			return fighter.getDmg();
		}

		
	}
	

}
