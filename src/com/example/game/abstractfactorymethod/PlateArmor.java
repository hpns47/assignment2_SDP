package com.example.game.abstractfactorymethod;

public class PlateArmor implements Armor{
    private final ArmorType armorType;
    public PlateArmor(ArmorType armorType) {
        this.armorType = armorType;
    }

    @Override
    public void equip() {
        switch (armorType) {
            case UPPER -> System.out.println("equiping upper armor");
            case LOWER -> System.out.println("equipping lower armor");
        }
    }
}
