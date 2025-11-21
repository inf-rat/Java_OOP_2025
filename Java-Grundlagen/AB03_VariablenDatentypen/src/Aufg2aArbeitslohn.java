public class Aufg2aArbeitslohn {
    public static void main(String[] args) {
        double arbeitslohn = 13.50;
        int teilzeitkraft = 20;
        int vollzeitkraft = 40;

        double teilzeitlohn = teilzeitkraft * arbeitslohn;
        double vollzeitlohn = vollzeitkraft * arbeitslohn;

        System.out.println("Wöchentlicher Teilzeitlohn: " + teilzeitlohn);
        System.out.println("Wöchentlicher Vollzeitlohn: " + vollzeitlohn);
    }
}
