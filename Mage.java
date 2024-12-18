package mkr;

public class Mage implements Character {
    private String name = "Маг";
    private int health = 100;
    private int attackPower = 40;
    private int x, y;

    public Mage(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println(name + " направляє заклинання з потужністю: " + attackPower);
    }

    @Override
    public void displayHealth() {
        System.out.println("Здоров'я мага: " + health);
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