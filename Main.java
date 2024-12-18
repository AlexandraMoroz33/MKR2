import mkr.*;
import mkr.Character;

public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();
        Arena arena = new Arena();
        Observer visibilityObserver = new CharacterVisibility();
        arena.addObserver(visibilityObserver);

        Character warrior = warriorFactory.createCharacter(0, 0);
        Character mage = mageFactory.createCharacter(6, 11);
        Character archer = archerFactory.createCharacter(2, 1);

        arena.addCharacter(warrior);
        warrior.displayHealth();
        warrior.attack();
        arena.moveCharacter(warrior, 11, 7);

        arena.addCharacter(mage);
        mage.displayHealth();
        arena.moveCharacter(mage, 3, 21);
        mage.attack();

        arena.addCharacter(archer);
        archer.displayHealth();
        archer.attack();
        arena.moveCharacter(archer, 7, 18);
    }
}