public class MethodExample2 {
    public static void main(String[] args) {
        topla(8, 9);

        double carpim = carp(4.2, 5.8);
        System.out.println("Çarpım sonucu: " + carpim);

        toplam(5, 9);
        toplam(5.8, 9.2);
    }

    public static void topla(int a, int b) {
        System.out.println("Toplam: " + (a + b));
    }

    public static double carp(double a, double b) {
        return a * b;
    }

    public static void toplam(int a, int b) {
        System.out.println(a + b);
    }

    public static void toplam(double a, double b) {
        System.out.println(a + b);
    }
}
