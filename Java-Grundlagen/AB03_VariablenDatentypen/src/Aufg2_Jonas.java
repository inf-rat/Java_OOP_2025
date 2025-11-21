import java.util.ArrayList;

public class Aufg2_Jonas {
    public static void main(String[] args) {
        A2B();
    }

    private static void A2A() {
        double lohn = 13.5;
        System.out.printf("%n%15s%15s", "Vollzeitlohn", "Teilzeitlohn");
        System.out.printf("%n%15s%15s", lohn*40, lohn*20);
    }

    private static void A2B() {
        ArrayList<Double> values = new ArrayList<>();
        values.add(126.4);
        values.add(192.9);
        values.add(241.1);
        System.out.printf("%15s%15s   %15s   %15s   %n", "Monat", "Oktober", "September", "August");
        System.out.printf("%15s%15s l %15s l %15s l %n", "Regenmenge", values.get(0), values.get(1), values.get(2));
        double medium = 0;

        for(double val : values) {
            medium += val;
        }
        medium /= values.size();

        System.out.printf("%n%15s:%15.2f l %n" , "Durchschnitt" , medium);
    }

    private static void A2C(int minutes) {
        double gebuehrA = 3.5;
        double preisA = .06;
        double gebuehrB = 0;
        double preisB = .10;
        System.out.printf("%n%15s%15s %15s %n", "Anbieter", "Grundgebühr", "Minutenpreis");
        System.out.printf("%15s%15.2f€%15.2f€%n", "Anbieter A", gebuehrA, preisA);
        System.out.printf("%15s%15.2f€%15.2f€%n", "Anbieter B", gebuehrB, preisB);

        System.out.printf("%n%20s:%15d %n", "Gesprächsminuten", minutes);
        System.out.printf("%20s:%15.2f€%n", "Kosten Anbieter A", gebuehrA+(minutes*preisA));
        System.out.printf("%20s:%15.2f€%n", "Kosten Anbieter B", gebuehrB+(minutes*preisB));
    }
}
