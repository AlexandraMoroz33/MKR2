package mkr;

public class CharacterVisibility implements Observer {
    @Override
    public void update(Character character) {
        System.out.println(character.getName() + " тепер видимий.");
    }
}
