import java.util.ArrayList;

public class CommandGenerator {
    private final Map map;
    int playerID;

    public enum Command {
        MOVE_RIGHT,
        MOVE_UP,
        MOVE_LEFT,
        MOVE_DOWN,
        LOOK,
        FIGHT,
        TAKE_ITEM;

        @Override
        public String toString() {
            return switch (this) {
                case MOVE_RIGHT -> "Move right";
                case MOVE_UP -> "Move up";
                case MOVE_LEFT -> "Move left";
                case MOVE_DOWN -> "Move down";
                case LOOK -> "Look around";
                case FIGHT -> "Fight the monster";
                case TAKE_ITEM -> "Take the weapon";
            };
        }

        public char toChar() {
            return switch (this) {
                case MOVE_RIGHT -> 'd';
                case MOVE_UP -> 'w';
                case MOVE_LEFT -> 'a';
                case MOVE_DOWN -> 's';
                case LOOK -> 'r';
                case FIGHT -> 'f';
                case TAKE_ITEM -> 't';
            };
        }
    }

    public CommandGenerator(Map map, int playerID) {
        this.map = map;
        this.playerID = playerID;
    }

    public ArrayList<Command> getCommands() {
        Player player = map.getPlayer(playerID);
        ArrayList<Command> commands = new ArrayList<>();
        if (map.hasTile(player.getRow(), player.getCol() + 1)) {
            commands.add(Command.MOVE_RIGHT);
        }
        if (map.hasTile(player.getRow() - 1, player.getCol())) {
            commands.add(Command.MOVE_UP);
        }
        if (map.hasTile(player.getRow(), player.getCol() - 1)) {
            commands.add(Command.MOVE_LEFT);
        }
        if (map.hasTile(player.getRow() + 1, player.getCol())) {
            commands.add(Command.MOVE_DOWN);
        }
        commands.add(Command.LOOK);
        Tile t = map.getTile(player.getRow(), player.getCol());
        if (t.hasMonster()) {
            commands.add(Command.FIGHT);
        }
        if (t.hasWeapon()) {
            commands.add(Command.TAKE_ITEM);
        }
        return commands;
    }

    public void executeCommand(Command cmd) {
        Player player = map.getPlayer(playerID);
        System.out.println(cmd);
        int r = player.getRow();
        int c = player.getCol();
        Tile t = map.getTile(r, c);
        switch (cmd) {
            case MOVE_RIGHT -> {
                c++;
                player.setPosition(r, c);
            }
            case MOVE_UP -> {
                r--;
                player.setPosition(r, c);
            }
            case MOVE_LEFT -> {
                c--;
                player.setPosition(r, c);
            }
            case MOVE_DOWN -> {
                r++;
                player.setPosition(r, c);
            }
            case LOOK -> {
                System.out.println(player);
                if (t.hasMonster()) {
                    System.out.println(t.getMaybeMonster().get());
                }
                if (t.hasWeapon()) {
                    System.out.println(t.getMaybeWeapon().get());
                }
            }
            case FIGHT -> {
                Battle battle = new Battle(player, t.getMaybeMonster().get());
                if (battle.attackMonster()) {
                    player.levelUp();
                    t.removeMonster();
                }
            }
            case TAKE_ITEM -> {
                Weapon w = t.getMaybeWeapon().get();
                player.setWeapon(w);
                t.removeWeapon();
            }
        }
    }
}
