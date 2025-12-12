import java.util.Scanner;

public class TestKlasse {
    public static void main(String[] args) {
        System.out.println("Wähle die anzahl.");
        Scanner sc = new Scanner(System.in);
        int anzahl = sc.nextInt();

        for  (int i = 1; i <= anzahl; i++) {
            System.out.println("Meow");
        }
    }
}
