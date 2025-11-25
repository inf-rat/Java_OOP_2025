import java.util.Scanner; // Die Scanner-Klasse importieren

public class Aufg1aUserInput {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in); // Scanner-Objekt erzeugen
        System.out.println("Hallo, wer bist du denn?");
        String userName = scObj.nextLine(); // User-Input einlesen
        System.out.println("Willkommen, " + userName + "!"); // Name ausgeben
        // a)  Wenn man nichts angibt, bekommt man eine Begrüßung ohne Namen.
    }
}

