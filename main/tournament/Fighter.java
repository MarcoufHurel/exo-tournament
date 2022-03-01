package tournament;


/** base for all different fighter implementation */
public abstract class Fighter {

	int hp,dmg;
	
	
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
		ennemy.getHit(dmg);
	
	}
	
	/** Receives a blow */
	public void getHit (int dmg) {
		hp = hp-dmg;
	}
	
	/** Show HP (negative HP will be shown as 0 */
	public int  hitPoints () {
		if(hp < 0) return 0;
		else return hp;
	}
	
}
