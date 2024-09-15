public class Hayvan {
    // Java'da miras alma, bir sınıfın başka bir sınıfın özelliklerini ve metotlarını devralmasını sağlar. Bu, kod tekrarını azaltır ve daha temiz bir yapı sağlar. Miras alan sınıfa alt sınıf (subclass), miras veren sınıfa ise üst sınıf (superclass) denir.

    // Çok biçimlilik, aynı metot ismi ile farklı işlemler yapabilmeyi sağlar. Java’da çok biçimlilik, genellikle method overriding ve method overloading ile gerçekleştirilir.

    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor.");
    }

    public void hareketEt() {
        System.out.println("Hayvan hareket ediyor.");
    }
}
