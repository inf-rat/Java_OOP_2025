

public class Aufg2_Mohamad {

    public static void main(String[] args) {
        System.out.println("Hello World");

        aufgabe2a();
        System.out.println("--------------------------------");
        aufgabe2b();
        System.out.println("--------------------------------");
        aufgabe2c();
        System.out.println("--------------------------------");


    }

    private static void aufgabe2c() {
        int minuten = 60;

        double gg1 = 3.50;
        double minpreis1 = 0.06;
        double ergebnis1 = gg1 + minuten * minpreis1;
        System.out.println("Anbieter A " + ergebnis1);

        double gg2 = 0.0;
        double minpreis2 = 0.10;
        double ergebnis2 = gg2 + minuten * minpreis2;
        System.out.println("Anbieter B " + ergebnis2);

        for (int i = 0; i <= 1000; i++){
            double a  = gg1 + i * minpreis1;
            double b = gg2 + i * minpreis2;
            if (a < b) {
                System.out.println("Günstiger: " +i);
                break;
            }
        }
    }

    private static void aufgabe2b() {
        double oktober = 126.4;
        double septemper = 192.9;
        double august = 241.1;

        double mittelwert = (oktober + septemper + august) / 3;
        mittelwert = Math.round(mittelwert * 100.0) / 100.0;
        System.out.println("Der Mittelwert beträgt " + mittelwert);
    }

    private static void aufgabe2a() {
        double arbeitslohn = 13.50;
        int vollzeitkraefte = 40;
        int teilzeitkraefte = 20;

        double ergebnis1 = arbeitslohn * vollzeitkraefte;
        double ergebnis2 =  arbeitslohn * teilzeitkraefte;

        System.out.println("Vollzeit " + ergebnis1);
        System.out.println("Teilzeit " +ergebnis2);
    }
}

