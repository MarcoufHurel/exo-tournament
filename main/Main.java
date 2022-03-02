import tournament.Highlander;
import tournament.Swordsman;
import tournament.Viking;

public class Main {
	public static void main(String[] args) {
		 Highlander highlander = new Highlander();

	        Swordsman swordsman = new Swordsman()
	                .equip("buckler")
	                .equip("armor");

	        swordsman.engage(highlander);

        
        System.out.println("Fighter "+ swordsman.getName() + " hp " + swordsman.hitPoints());
        System.out.println("Fighter "+ highlander.getName() + " hp " + highlander.hitPoints());
	}

}
