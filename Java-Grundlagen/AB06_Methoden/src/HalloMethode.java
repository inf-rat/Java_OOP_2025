public class HalloMethode {
    public static void hello(String name) {
        System.out.println("Hallo, " + name + "!");
    }
    public static void main(String[] args) {
        String name = new String("Elon Musk");
        hello(name);
    }
}