import java.util.Scanner; // Die Scanner-Klasse importieren

public class Aufg1bUserInput {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in); // Scanner-Objekt erzeugen
        System.out.println("Hallo, wer bist du denn?");
        String userName = scObj.nextLine(); // User-Input einlesen
        if (userName.isEmpty()) {
            System.out.println("Fehler! Es wurde kein Name angegeben.");
        } else {
            System.out.println("Willkommen, " + userName + "!");
        }
    }
}

