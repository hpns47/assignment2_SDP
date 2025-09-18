package com.example.game.abstractfactorymethod;

public class Gun implements Weapon{
    @Override
    public void use(){
        System.out.println("shooting from handgun");
    }
}
