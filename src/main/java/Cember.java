public class Cember extends GeometrikSekil {
    int yaricap;

    public Cember(int yaricap) {
        this.yaricap = yaricap;
    }

    public String toString() {
        return (alanBul() + " alanı ve " + cevreBul() + " cevresi olan Cember Şeklimiz oluştu.");
    }

    public void cizimYap() {
        System.out.println("Yarıçapı " + yaricap + " olan çamber çizildi.");
    }

    public int alanBul() {
        AlaniHesapla alan = new AlaniHesapla();
        double alanDegeri = alan.cemberAlani(yaricap);
        return (int) alanDegeri;
    }

    public int cevreBul() {
        CevreyiHesapla cevre = new CevreyiHesapla();
        double cevreDegeri = cevre.cemberCevresi(yaricap);
        return (int) cevreDegeri;
    }
}
