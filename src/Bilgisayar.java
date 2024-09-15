public class Bilgisayar {
    public String model;
    public String marka;
    public int fiyat;

    public Bilgisayar(String model, String marka, int fiyat) {
        this.model = model;
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public void bilgileriGoster() {
        System.out.println("Model: " + model);
        System.out.println("Marka: " + marka);
        System.out.println("Fiyat: " + fiyat);
    }
}
