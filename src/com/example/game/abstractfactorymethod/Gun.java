package com.example.game.abstractfactorymethod;

public class Gun implements Weapon{
    private final GunType gunType;

    public Gun(GunType gunType){
        this.gunType = gunType;
    }


    @Override
    public void use() {
        switch (gunType) {
            case PISTOL -> System.out.println("Shooting with a pistol!");
            case RIFLE -> System.out.println("Firing a rifle!");
        }
    }
}
