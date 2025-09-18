package com.example.game.abstractfactorymethod;

public class GameDemo {
    public static void main(String[] args) {
        ItemFactory ancientFactory = new AncientItemFactory();
        ItemFactory modernFactory = new ModernItemFactory();

        System.out.println("ancient====================");
        ancientFactory.createArmor().equip();
        ancientFactory.createWeapon().use();
        System.out.println("modern====================");
        modernFactory.createArmor().equip();
        modernFactory.createWeapon().use();
    }
}
