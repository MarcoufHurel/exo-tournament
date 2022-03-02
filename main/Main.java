import tournament.Highlander;
import tournament.Swordsman;
import tournament.Viking;

public class Main {
	public static void main(String[] args) {
		Swordsman swordsman = new Swordsman("Vicious")
                .equip("axe")
                .equip("buckler")
                .equip("armor");

        Highlander highlander = new Highlander("Veteran");

        swordsman.engage(highlander);

        
        System.out.println("Fighter "+ swordsman.getName() + " hp " + swordsman.hitPoints());
        System.out.println("Fighter "+ highlander.getName() + " hp " + highlander.hitPoints());
	}

}
