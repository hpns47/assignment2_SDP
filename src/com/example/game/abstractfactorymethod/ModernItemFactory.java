package com.example.game.abstractfactorymethod;

public class ModernItemFactory implements ItemFactory {
    @Override
    public Weapon createWeapon(){
        return new Gun();
    }

    @Override
    public Armor createArmor(){
        return new Vest();
    }
}
