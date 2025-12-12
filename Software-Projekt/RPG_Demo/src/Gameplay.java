import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gameplay {
    public static int diceRoll(int maxNum) {
        Random rand = new Random();
        return rand.nextInt(maxNum) + 1;
    }

    public static void main(String[] args) {
        // initialize Gamestate
        Map map = new Map(4, 5);
        System.out.println("\nMonsters:");
        map.initMonsters(10);
        System.out.println("\nWeapons:");
        map.initWeapons(5);

        // Get Player Names
        Scanner scan = new Scanner(System.in);
        Player p;
        int playersAlive = 0;
        while (playersAlive < 5) {
            System.out.println("\nSpieler " + (playersAlive + 1) + ", wie soll dein Held heißen? (Enter: Genug Spieler!)");
            String heroName = scan.nextLine();
            if (heroName.isEmpty()) {
                break;
            } else {
                p = new Player(heroName);
                Tile t = map.getRandomTile();
                map.addPlayer(p, t.getRow(), t.getCol());
                playersAlive++;
            }
        }

        int numPlayers = map.getNumPlayers();
        int playerID = diceRoll(numPlayers);

        while (playersAlive > 0) {
            do {
                playerID = (playerID + 1) % numPlayers;
                p = map.getPlayer(playerID);
            } while (!p.isAlive());

            CommandGenerator cmdGen = new CommandGenerator(map, playerID);
            map.display();
            ArrayList<CommandGenerator.Command> cmdList = cmdGen.getCommands();
            StringBuilder possibleKeys = new StringBuilder();
            System.out.println("\n" + p.getName() + ", what do you want to do?");
            for (CommandGenerator.Command cmd : cmdList) {
                char key = cmd.toChar();
                possibleKeys.append(key);
                System.out.println(String.format("%9s: ", key) + cmd);
            }
            System.out.println("Other key: Exit game");
            Scanner input = new Scanner(System.in);
            char c = input.next().charAt(0);
            int cmdIndex = possibleKeys.toString().indexOf(c);
            if (cmdIndex < 0) {
                break; // Quit the game
            }
            cmdGen.executeCommand(cmdList.get(cmdIndex));
            if (!p.isAlive()) {
                playersAlive--;
            }
        }

    }
}
