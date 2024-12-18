package mkr;

public class Archer implements Character {
    private String name = "Лучник";
    private int health = 120;
    private int attackPower = 30;
    private int x, y;

    public Archer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println(name + " Запускає стрілу з потужністю: " + attackPower);
    }

    @Override
    public void displayHealth() {
        System.out.println("Здоров'я лучника: " + health);
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
