import tournament.Swordsman;
import tournament.Viking;

public class Main {
	public static void main(String[] args) {
		Swordsman swordsman = new Swordsman()
                .equip("buckler");

        Viking viking = new Viking()
                .equip("buckler");

        swordsman.engage(viking);

        
        System.out.println("Fighter "+ swordsman.getName() + " hp " + swordsman.hitPoints());
        System.out.println("Fighter "+ viking.getName() + " hp " + viking.hitPoints());
	}

}
