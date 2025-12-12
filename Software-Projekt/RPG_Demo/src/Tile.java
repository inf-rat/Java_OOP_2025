import java.util.Optional;
public class Tile {
    private final int row;
    private final int col;
    private Optional<Monster> maybeMonster;
    private Optional<Weapon> maybeWeapon;

    public Tile(int row, int col) {
        this.row = row;
        this.col = col;
        this.maybeMonster = Optional.empty();
        this.maybeWeapon = Optional.empty();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean hasMonster() {
        return maybeMonster.isPresent();
    }

    public boolean hasWeapon() {
        return maybeWeapon.isPresent();
    }


    public Optional<Monster> getMaybeMonster() {
        return maybeMonster;
    }

    public void setMaybeMonster(Monster maybeMonster) {
        this.maybeMonster = Optional.of(maybeMonster);
    }

    public Optional<Weapon> getMaybeWeapon() {
        return maybeWeapon;
    }

    public void setMaybeWeapon(Weapon maybeWeapon) {
        this.maybeWeapon = Optional.of(maybeWeapon);
    }

    public void removeWeapon() {
        this.maybeWeapon = Optional.empty();
    }

    public void removeMonster() {
        this.maybeMonster = Optional.empty();
    }
}
