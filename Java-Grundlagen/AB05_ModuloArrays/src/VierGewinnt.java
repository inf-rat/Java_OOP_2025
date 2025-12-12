import java.util.Scanner;

public class VierGewinnt {
    public static void main(String[] args) {
        String[] names = new String[2];
        Scanner scObj = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name von Spieler " + (i + 1) + ": ");
            names[i] = scObj.nextLine();
            while (names[i].isEmpty()) {
                System.out.println("Name ungültig. Bitte erneut versuchen:");
                names[i] = scObj.nextLine();
            }
            System.out.println("Spieler " + (i + 1) + ": " + names[i]);
        }
        int[] anzahlSteine = new int[7];
        System.out.println("Anzahl der Steine im Spielfeld:");
        for (int anzahl: anzahlSteine) {
            System.out.print(anzahl + " ");
        }


    }
}
