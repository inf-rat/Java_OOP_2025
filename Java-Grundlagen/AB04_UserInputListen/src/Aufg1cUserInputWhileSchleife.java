import java.util.Scanner; // Die Scanner-Klasse importieren

public class Aufg1cUserInputWhileSchleife {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Bitte gib deinen Namen ein: ");
        String userName = scObj.nextLine();
        while (userName.isEmpty()) {
            System.out.println("Die Eingabe darf nicht leer sein. Bitte versuche es erneut:");
            userName = scObj.nextLine();
        }
        System.out.println("Willkommen, " + userName + "!");
    }
}

