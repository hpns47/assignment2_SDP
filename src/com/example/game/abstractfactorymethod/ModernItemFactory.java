package com.example.game.abstractfactorymethod;

public class ModernItemFactory implements ItemFactory {
    @Override
    public Weapon createWeapon(){
        return new Gun(GunType.RIFLE);
    }

    @Override
    public Armor createArmor(){
        return new Vest(VestType.KEVLAR);
    }
}
