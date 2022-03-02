package factory;

import equipment.Equipment;
import equipment.shields.Buckler;
import equipment.weapons.OneHandAxe;
import equipment.weapons.OneHandSword;


public class EquipmentFactory implements AbstractFactory<Equipment>{
	
	@Override
    public Equipment create(String equipmentType) {
        if ("OneHandAxe".equalsIgnoreCase(equipmentType)) {
            return new OneHandAxe();
        } else if ("OneHandSword".equalsIgnoreCase(equipmentType)) {
            return new OneHandSword();
        } else if ("Buckler".equalsIgnoreCase(equipmentType)) {
            return new Buckler();
        }

        return null;
    }
	

}
