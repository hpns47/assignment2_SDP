import com.example.game.factorymethod.ArcherSpawner;
import com.example.game.factorymethod.KnightSpawner;
import com.example.game.factorymethod.UnitSpawner;

import com.example.game.abstractfactorymethod.AncientItemFactory;
import com.example.game.abstractfactorymethod.ModernItemFactory;
import com.example.game.abstractfactorymethod.ItemFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======Factory Method Demo");

        UnitSpawner archerSpawner = new ArcherSpawner();
        UnitSpawner knightSpawner = new KnightSpawner();

        archerSpawner.spawnAndAttack();
        knightSpawner.spawnAndAttack();

        System.out.println("\n======Abstract Factory Demo");

        ItemFactory ancientFactory = new AncientItemFactory();
        ItemFactory modernFactory = new ModernItemFactory();

        System.out.println("ancient world:");
        ancientFactory.createWeapon().use();
        ancientFactory.createArmor().equip();

        System.out.println("modern world:");
        modernFactory.createWeapon().use();
        modernFactory.createArmor().equip();
    }
}

