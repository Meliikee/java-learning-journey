public class Araba2 {
    private String marka;
    private String model;
    private int yil;

    // Kapsülleme, bir sınıfın içindeki verilerin gizlenmesi ve dışarıdan doğrudan erişilememesi anlamına gelir. Getter ve setter metotları ile verilere erişilir.

    // Getter ve Setter metotları
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
