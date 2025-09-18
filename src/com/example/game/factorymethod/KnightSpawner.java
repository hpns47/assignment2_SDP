package com.example.game.factorymethod;

public class KnightSpawner extends UnitSpawner {
    @Override
    public Unit createUnit() {
        return new Knight();
    }
}
