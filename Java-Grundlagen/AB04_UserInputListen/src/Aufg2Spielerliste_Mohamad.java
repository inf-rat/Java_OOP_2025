import java.util.ArrayList;
import java.util.Scanner;

public class Aufg2Spielerliste_Mohamad {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        String playerNamesAbfrage;
        ArrayList<String> playerNames = new ArrayList<>();

        do {
            System.out.println("Please enter the name of the player");
            playerNamesAbfrage = scObj.nextLine();
            playerNames.add(playerNamesAbfrage);

            System.out.println(playerNames);
        } while (!playerNamesAbfrage.isEmpty());

        scObj.close();
    }

}







