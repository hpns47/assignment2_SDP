package com.example.game.abstractfactorymethod;

public class Sword implements Weapon{
    private final SwordType swordType;
    public Sword(SwordType swordType) {
        this.swordType = swordType;
    }

    @Override
    public void use(){
        switch(swordType){
            case SABRE -> System.out.println("using sabre");
            case CLEAVER -> System.out.println("using cleaver");
        }
    }
}
