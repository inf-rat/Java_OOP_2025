import java.util.ArrayList;
import java.util.List;

public class Map {
    int rows, cols;
    Tile[][] tiles;
    List<Player> playerList;
    char[][] displayBuffer;

    public Map(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        tiles = new Tile[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                tiles[r][c] = new Tile(r, c);
            }
        }
        displayBuffer = new char[3 * rows + 1][6 * cols + 1];
        for (int i = 0; i < displayBuffer.length; i++) {
            for (int j = 0; j < displayBuffer[0].length; j++) {
                if (i % 3 == 0 || j % 6 == 0) {
                    displayBuffer[i][j] = '█';
                } else {
                    displayBuffer[i][j] = ' ';
                }
            }
        }
        playerList = new ArrayList<>();
    }

    public int addPlayer(Player p, int row, int col) {
        playerList.add(p);
        p.setPosition(row, col);
        return playerList.size() - 1;
    }

    public Player getPlayer(int playerID) {
        return playerList.get(playerID);
    }

    public char[] getPlayerDisplay(int row, int col) {
        char[] playerDisplay = "     ".toCharArray();
        for (int playerID = 0; playerID < playerList.size(); playerID++) {
            Player player = getPlayer(playerID);
            if (player.getRow() == row && player.getCol() == col) {
                playerDisplay[(1 + 2 * playerID) % playerDisplay.length] = getPlayer(playerID).getToken();
            }
        }
        return playerDisplay;
    }

    public int getNumTiles() {
        return rows * cols;
    }

    public int getNumPlayers() {
        return playerList.size();
    }

    public void display() {
        System.out.println("\nMap:");

        // Monsters, Weapons & Playes
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // Monsters
                if (tiles[r][c].hasMonster()) {
                    displayBuffer[3 * r + 1][6 * c + 2] = 'M';
                } else {
                    displayBuffer[3 * r + 1][6 * c + 2] = ' ';
                }
                // Weapons
                if (tiles[r][c].hasWeapon()) {
                    displayBuffer[3 * r + 1][6 * c + 4] = 'W';
                } else {
                    displayBuffer[3 * r + 1][6 * c + 4] = ' ';
                }
                // Players
                char[] pDisplay = getPlayerDisplay(r, c);
                for (int i = 0; i < pDisplay.length; i++) {
                    displayBuffer[3 * r + 2][6 * c + 1 + i] = pDisplay[i];
                }
            }
        }

        // Players
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (tiles[r][c].hasMonster()) {
                    displayBuffer[3 * r + 1][6 * c + 2] = 'M';
                } else {
                    displayBuffer[3 * r + 1][6 * c + 2] = ' ';
                }
                if (tiles[r][c].hasWeapon()) {
                    displayBuffer[3 * r + 1][6 * c + 4] = 'W';
                } else {
                    displayBuffer[3 * r + 1][6 * c + 4] = ' ';
                }
            }
        }



        // Show Map
        for (char[] chars : displayBuffer) {
            for (int j = 0; j < displayBuffer[0].length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    public void initMonsters(int numMonsters) {
        if (numMonsters > getNumTiles()) {
            numMonsters = getNumTiles();
        }
        int maxLevel = 1;
        int numLevel;
        while (numMonsters > 0) {
            numLevel = numMonsters / 3;
            if (numLevel == 0) {
                numLevel++;
            }
            for (int i = 0; i < numLevel; i++) {
                Tile t;
                do {
                    int n = Gameplay.diceRoll(this.getNumTiles()) - 1;
                    t = tiles[n / cols][n % cols];
                } while (t.hasMonster());
                Monster m = new Monster(Gameplay.diceRoll(maxLevel));
                t.setMaybeMonster(m);
                System.out.println(m);
            }
            maxLevel += 2;
            numMonsters -= numLevel;
        }
    }

    public void initWeapons(int numWeapons) {
        if (numWeapons > getNumTiles()) {
            numWeapons = getNumTiles();
        }
        int maxLevel = 1;
        int numLevel;
        while (numWeapons > 0) {
            numLevel = numWeapons / 3;
            if (numLevel == 0) {
                numLevel++;
            }
            for (int i = 0; i < numLevel; i++) {
                Tile t;
                do {
                    t = getRandomTile();
                } while (t.hasWeapon());
                Weapon w = new Weapon(Gameplay.diceRoll(maxLevel));
                t.setMaybeWeapon(w);
                System.out.println(w);
            }
            maxLevel += 3;
            numWeapons -= numLevel;
        }
    }



    public Tile getTile(int row, int col) {
        return tiles[row][col];
    }

    public boolean hasTile(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public Tile getRandomTile() {
        int n = Gameplay.diceRoll(this.getNumTiles()) - 1;
        return tiles[n / cols][n % cols];
    }
}
