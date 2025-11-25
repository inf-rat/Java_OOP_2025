import java.util.ArrayList;
import java.util.Scanner;

public class Aufg2Spielerliste {
    public static void main(String[] args) {
        ArrayList<String> playerNames = new ArrayList<>();
        Scanner inputName = new Scanner(System.in);
        System.out.println("Geben Sie einen Spieler namen ein: ");
        while (true) {
            System.out.println("Spielername: (Enter zum beenden)");
            String name = inputName.nextLine();
            if (name.isEmpty()) {
                break;
            }
            playerNames.add(name);
        }
        System.out.println("Spielerliste: ");
        for (String name : playerNames) {
            System.out.println(name);
        }

    }
}
