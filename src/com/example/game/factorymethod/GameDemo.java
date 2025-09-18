package com.example.game.factorymethod;

public class GameDemo {
    public static void main(String[] args) {
        UnitSpawner archerSpawner = new ArcherSpawner();
        UnitSpawner knightSpawner = new KnightSpawner();

        archerSpawner.spawnAndAttack();
        knightSpawner.spawnAndAttack();
    }
}
