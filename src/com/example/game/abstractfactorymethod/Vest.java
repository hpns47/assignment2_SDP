package com.example.game.abstractfactorymethod;

public class Vest implements Armor {
    private final VestType type;

    public Vest(VestType type) {
        this.type = type;
    }

    @Override
    public void equip() {
        switch (type) {
            case KEVLAR -> System.out.println("Wearing a kevlar vest!");
            case CERAMIC -> System.out.println("Wearing a ceramic vest!");
        }
    }
}
