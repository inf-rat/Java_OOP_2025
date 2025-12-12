public class Aufg3bForEach {
    public static void main(String[] args) {
        int[] zahlen = new int[10];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i + 1;
        }
        for (int zahl: zahlen) {
            System.out.println("Rest der Zahl " + zahl + ": " + zahl % 3);
        }
    }
}
