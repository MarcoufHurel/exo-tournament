package equipment.shields;

import equipment.Equipment;
import tournament.Fighter;

public abstract class Shield implements Equipment {

	int hitBeforeBreaking, hitTaken=0;
	boolean blockLastHit=false;
	String equimentType = "Shield";
	String name;
	
	/** Return the number of damage after being hit */
	public int getHit (Fighter fighter) {
		
		/** check if the shield is destroyed (return damage without blocking) */
		if(hitTaken>=hitBeforeBreaking) {
			//System.out.println("shield is broken");
			return fighter.getDmg();
		}
		
		
		 
		 if(blockLastHit) {
			 /** has blocked last hit, will not block this one*/
			 //System.out.println("shield doesn't block");
			 blockLastHit=false;
			 return fighter.getModifiedDmg();
		 } else {
			 /** has not blocked last hit, will block this one*/
			 //System.out.println("shield block");
			 /** count the blow if the weapon can breake shield */ 
			if(fighter.getWeapon().getCanBreakShield()) {
				//System.out.println("shield take axe hit");
				hitTaken+=1; 
			 }
				
			 blockLastHit=true;
			 return 0;
		 }
		 
		 
	}
	
	
	public void setHitBeforeBreaking(int hitBeforeBreaking) {
		this.hitBeforeBreaking=hitBeforeBreaking;
	}
	
	public int getHitBeforeBreaking () {
		return hitBeforeBreaking;
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
	
}
