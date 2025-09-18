package com.example.game.factorymethod;

public abstract class UnitSpawner {
    // factory method
    public abstract Unit createUnit();

    // template method
    public void spawnAndAttack() {
        Unit unit = createUnit();
        unit.attack();
    }
}
