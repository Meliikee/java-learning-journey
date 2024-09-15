public class Araba {
    // Sınıfın özellikleri (field'lar)
    String marka;
    String model;
    int yil;

    // Constructor : Constructor'lar bir sınıfın nesnesi oluşturulurken otomatik olarak çalışan özel metotlardır.
    public Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    // Sınıfın davranışları (metotlar)
    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}