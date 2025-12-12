public class Player extends Creature {
    private Weapon weapon;
    private int col;
    private int row;

    public Player(String name) {
        super(1);
        this.setName(name);
        this.weapon = new Weapon(0, "bare Hands");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        System.out.println(this.getName() + " picks up the " + weapon.getName() + ".");
        this.weapon = weapon;
    }

    @Override
    public int attack() {
        return super.getStrength() + this.getWeapon().getStrength() + Gameplay.diceRoll(20);
    }

    @Override
    public String fightingStyle() {
        return "with " + weapon.getName();
    }

    public int getCol() {
        return col;
    }

    public void setPosition(int row, int col) {
        this.col = col;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public char getToken() {
        if (isAlive()) {
            return getName().charAt(0);
        } else {
            return '†';
        }
    }

    @Override
    public String toString() {
        return "Player: \t" + getName() + ", Level: " + getLevel() + ", HP: " + getHitPoints() + ", Str: "
                + getStrength() + ", WpStr: " + getWeapon().getStrength();
    }
}
