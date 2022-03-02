package factory;

import equipment.Equipment;
import equipment.armor.BasicArmor;
import equipment.shields.Buckler;
import equipment.weapons.GreatSword;
import equipment.weapons.OneHandAxe;
import equipment.weapons.OneHandSword;


public class EquipmentFactory implements AbstractFactory<Equipment>{
	
	@Override
    public Equipment create(String equipmentType) {
        if ("OneHandAxe".equalsIgnoreCase(equipmentType)) {
            return new OneHandAxe();
        } else if ("OneHandSword".equalsIgnoreCase(equipmentType)) {
            return new OneHandSword();
        } else if ("GreatSword".equalsIgnoreCase(equipmentType)) {
        	 return new GreatSword();
		} else if ("Buckler".equalsIgnoreCase(equipmentType)) {
            return new Buckler();
        } else if ("Armor".equalsIgnoreCase(equipmentType)) {
            return new BasicArmor();
        }

        return null;
    }
	

}
