public class Battle {
    private final Player player;
    private final Monster monster;

    public Battle(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public boolean attackMonster() {
        Creature attacker = player;
        Creature defender = monster;
        if (Gameplay.diceRoll(2) > 1) {
            attacker = monster;
            defender = player;
        }
        System.out.println();
        System.out.print(attacker.getName());
        System.out.print(" starts to attack " + attacker.fightingStyle() + " and ");
        System.out.print(defender.getName());
        System.out.println(" defends " + defender.fightingStyle() + ".");

        while (attacker.isAlive()) {
            int damage = attacker.attack();
            System.out.print(attacker.getName());
            System.out.print(" hits ");
            System.out.print(defender.getName());
            System.out.print(" for ");
            System.out.print(damage);
            System.out.println(" hitpoints of damage.");
            int newHP = defender.getHitPoints() - damage;
            if (newHP <= 0) {
                newHP = 0;
                System.out.print(defender.getName());
                System.out.println(" is dead.");
            }
            defender.setHitPoints(newHP);
            Creature tmp = attacker;
            attacker = defender;
            defender = tmp;
            wait(1000);
        }
        return !monster.isAlive();
    }
}
