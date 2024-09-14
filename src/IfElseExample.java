public class IfElseExample {
    // Karar yapıları, belirli bir koşula bağlı olarak farklı işlemler yapmanı sağlar.

    public static void main(String[] args) {
        int yas = 18;

        if (yas >= 18) {
            System.out.println("Yetişkin");
        } else {
            System.out.println("Çocuk");
        }

        int sayi = 0;

        if (sayi > 0) {
            System.out.println("Sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Sayı negatiftir.");
        } else {
            System.out.println("Sayı 0'dır.");
        }
    }
}
