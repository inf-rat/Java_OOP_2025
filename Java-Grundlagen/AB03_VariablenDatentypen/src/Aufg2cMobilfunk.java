public class Aufg2cMobilfunk {
    public static void main(String[] args) {

        double GrundgebuehrA = 3.5;
        double GrundgebuehrB = 0.0;

        double minPreisA = 0.06;
        double minPreisB = 0.10;

        int minuten = 60;

        double kostenanbieter1 = GrundgebuehrA + (minPreisA * minuten);
        double kostenanbieter2 = GrundgebuehrB + (minPreisB * minuten);

        System.out.println("Gesprächsminuten: " + minuten);
        System.out.println("Kostenanbieter A: " + kostenanbieter1);
        System.out.println("Kostenanbieter B: " + kostenanbieter2);

    }
}
