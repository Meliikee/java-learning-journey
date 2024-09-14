public class MethodExample {
    // Metotlar ve fonksiyonlar
    // Java'da metotlar, belirli bir görevi yerine getiren kod bloklarıdır.
    // Tekrar eden işlemleri daha organize bir şekilde kullanmamızı sağlar.

    public static void main(String[] args) {
        selamVer(); // Metot çağrılıyor.

        toplamaIslemi(5, 3);

        int toplam = ikiSayiyiTopla(4, 7);
        System.out.println("Toplam: " + toplam);

        System.out.println(topla(3, 5));
        System.out.println(topla(2.5, 4.3));
    }

    // Metot tanımlama
    public static void selamVer() {
        System.out.println("Merhaba, metotlar!");
    }

    public static void toplamaIslemi(int a, int b) {
        int sonuc = a + b;
        System.out.println("Sonuç: " + sonuc);
    }

    public static int ikiSayiyiTopla(int x, int y) {
        return x + y;
    }

    // Metot Overloading (Aşırı Yükleme)
    // Java'da aynı isimde ancak farklı parametrelerle birden fazla metot tanımlayabiliriz. Buna overloading denir.

    public static int topla(int a, int b) {
        return a + b;
    }

    public static double topla(double a, double b) {
        return a + b;
    }
}
