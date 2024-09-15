public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        int a = 4;
        double b = 4.25;
        boolean c = true;
        char d = 'M';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Araba sınıfından nesneler oluşturma
        Araba araba1 = new Araba("Toyota", "Corolla", 2020);
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2020;

        // Nesne üzerindeki metodu çağırma
        araba1.bilgileriGoster();

        Telefon telefon1 = new Telefon();
        telefon1.marka = "Apple";
        telefon1.model = "iPhone 13";
        telefon1.fiyat = 38000;

        telefon1.bilgileriGoster();

        Bilgisayar bilgisayar1 = new Bilgisayar("Matebook D16", "Huawei", 35000);
        bilgisayar1.bilgileriGoster();

        // Inheritance
        Kopek kopek1 = new Kopek();
        kopek1.sesCikar();

        // Polymorphism
        // Hayvan sınıfının sesCikar metodu her alt sınıfta kendine özgü bir şekilde tanımlanmıştır.
        Hayvan hayvan1 = new Kopek();
        Hayvan hayvan2 = new Kedi();

        hayvan1.sesCikar();
        hayvan2.sesCikar();

        Kopek kopek = new Kopek();
        kopek.hareketEt();

        Mudur mudur = new Mudur();
        mudur.calis();

        Hayvan hayvan3 = new Kus();
        hayvan3.sesCikar();

        Hayvan hayvan4 = new Balik();
        hayvan4.sesCikar();

        Hayvan2 kopek2 = new Kopek2();
        kopek2.sesCikar();
        kopek2.uyuma();

        Kus2 kus = new Kus2();
        Balik2 balik = new Balik2();

        kus.uc();
        balik.yuz();

        Penguen penguen = new Penguen();
        penguen.uc();
        penguen.yuz();

        Arac arac1 = new Kamyon();
        Arac arac2 = new Bisiklet();

        arac1.tasitTuru();
        arac2.tasitTuru();

        Ucak ucak = new Ucak();
        ucak.ses();
        ucak.uc();


        // Try-Catch Örneği
        try {
            int sayi = 10 / 0; // Hata , bir sayı sıfıra bölünemez.
        } catch (ArithmeticException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        } finally {
            System.out.println("Program sonlandı.");
        }

        try {
            int[] sayilar = {1, 2, 3};
            System.out.println(sayilar[5]); // Hata: Dizi sınırlarının dışında
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi sınır hatası: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Genel hata: " + e.getMessage());
        } finally {
            System.out.println("Program sonlandı.");
        }

        //   checkAge(15); // Bu satır IllegalArgumentException fırlatacak

        int sayi1 = 5;
        int sayi2 = 0;

        try {
            int bolum = sayi1 / sayi2;
            System.out.println("Bölüm sonucu: " + bolum);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Bir sayı sıfıra bölünemez." + e.getMessage());
        } finally {
            System.out.println("Program sonlandı!");
        }

        try {
            int[] dizi = {1, 2, 3, 4, 5};
            System.out.println(dizi[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Genel hata: " + e.getMessage());
        } finally {
            System.out.println("Program sonlandı.");
        }

        checkTC("123456789");
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Yaş 18'den küçük olamaz.");
        } else {
            System.out.println("Yaş uygun.");
        }
    }

    public static void checkTC(String TC) {
        if (TC.length() != 11) {
            throw new IllegalArgumentException("Uygun bir TC kimlik numarası değil.");
        } else {
            System.out.println("TC kimlik numaranız: " + TC);
        }
    }

    /*
    1. Değişkenler ve Veri Tipleri
    Java’da veri tipleri iki ana kategoriye ayrılır:

    * Primitive (ilkel) veri tipleri: int, double, boolean, char, vb.
    * Referans veri tipleri: Sınıflar, diziler ve diğer nesneler.
     */

    /*
    Primitive veri tipleri:

    int – Tam sayılar (örn: 1, -5)
    double – Ondalıklı sayılar (örn: 3.14, -0.001)
    boolean – true veya false değerleri
    char – Tek bir karakter (örn: 'a', 'B')
     */

}