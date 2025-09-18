package com.example.game.factorymethod;

public class ArcherSpawner extends UnitSpawner {
    @Override
    public Unit createUnit() {
        return new Archer();
    }
}
