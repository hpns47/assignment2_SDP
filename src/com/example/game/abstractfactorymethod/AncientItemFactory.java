package com.example.game.abstractfactorymethod;

public class AncientItemFactory implements ItemFactory{
    @Override
    public Weapon createWeapon(){
        return new Sword();
    }

    @Override
    public Armor createArmor(){
        return new PlateArmor();
    }
}
