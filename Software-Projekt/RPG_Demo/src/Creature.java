abstract class Creature {
    private int level;
    private int hitPoints;
    private int strength;
    private String name;

    public Creature(int level) {
        if (level < 1) {
            level = 1;
        }
        this.level = level;
        this.hitPoints = maxHitPoints();
        this.strength = maxHitPoints() / 5;
        this.name = "Unnamed Creature";
    }

    public int maxHitPoints() {
        return (int) Math.round(100.0 * Math.sqrt(level));
    }

    public void levelUp() {
        level++;
        this.hitPoints = maxHitPoints();
        this.strength = maxHitPoints() / 5;
        System.out.print("\nLevel Up: ");
        System.out.println(getName() + " is now Level " + getLevel() + ". Hooray! :)");
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public abstract int attack();

    public abstract String fightingStyle();

    public boolean isAlive() {
        return hitPoints > 0;
    }
}
