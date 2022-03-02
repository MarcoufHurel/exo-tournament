package equipment.weapons;

public class GreatSword extends Weapon {
	
	int nonEffectiveBlow = 3;
	
	public GreatSword() {
		this.setName("GreatSword");
		this.setDmg(12);
	}
	
	@Override
	public int getDmg() {	
		//System.out.println("hitCount "+ hitCount);
		if(hitCount%nonEffectiveBlow==0) {
			//System.out.println("non effective blow");
			return 0;
		}
		return dmg;
	}
	
}
