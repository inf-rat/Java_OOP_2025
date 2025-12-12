public class Teilbarkeit {
    public static boolean istTeilbarDurch(int zahl, int teiler) {
        if (zahl % teiler == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean istPrimzahl(int zahl) {
        if (zahl < 2) {
            return false;
        }
        for (int t = 2; t < zahl; t++){
            if (istTeilbarDurch(zahl, t)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int z = 84;
        int t = 7;
        if (istTeilbarDurch(z, t)) {
            System.out.println(z + " ist teilbar durch " + t);
        } else {
            System.out.println(z + " ist nicht teilbar durch " + t);
        }
        int testZahl = 124;
        System.out.println(istPrimzahl(testZahl));
    }
}