package mkr;

public class Warrior implements Character {
    private String name = "Воїн";
    private int health = 150;
    private int attackPower = 20;
    private int x, y;

    public Warrior(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує з потужністю: " + attackPower);
    }

    @Override
    public void displayHealth() {
        System.out.println("Здоров'я воїна: " + health);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " переміщується до координат (" + x + ", " + y + ")");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void updateVisibility() {
    }
}