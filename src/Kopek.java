public class Kopek extends Hayvan {
    // Kopek sınıfı Hayvan sınıfından miras alıyor ve sesCikar metodunu kendi ihtiyacına göre yeniden tanımlıyor.

    @Override
    public void sesCikar() {
        System.out.println("Köpek havlıyor.");
    }

    // super.hareketEt() ile üst sınıftaki metot çağrılmış ve ardından alt sınıfın metodu çalıştırılmıştır.
    public void hareketEt() {
        super.hareketEt(); // Üst sınıfındaki hareketEt metodunu çağırır.
        System.out.println("Köpek koşuyor.");
    }
}
