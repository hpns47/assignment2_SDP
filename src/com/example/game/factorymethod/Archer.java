package com.example.game.factorymethod;

public class Archer implements Unit {
    @Override
    public void attack() {
        System.out.println("Archer shoots");
    }
}
