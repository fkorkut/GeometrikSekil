public class Dikdörtgen extends GeometrikSekil implements DikCizebilir {
    int uzunKenar;
    int kisaKenar;

    public Dikdörtgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public void dikCizimYap() {
        System.out.println("Sekil kenarları dik olacak şekilde oluşturuldu.");
    }

    public String toString() {
        return (alanBul() + " alanı ve " + cevreBul() + " cevresi olan Dikdörtgen Şeklimiz oluştu.");
    }

    public void cizimYap() {
        System.out.println("Kenar uzunlukları " + uzunKenar + " " + kisaKenar + " olan dikdörtgen oluşturuldu");
    }

    public int alanBul() {
        AlaniHesapla alan = new AlaniHesapla();
        int alanDegeri = alan.dortgenAlani(uzunKenar, kisaKenar);
        return alanDegeri;
    }

    public int cevreBul() {
        CevreyiHesapla cevre = new CevreyiHesapla();
        int cevreDegeri = cevre.dortgenCevre(uzunKenar, kisaKenar);
        return cevreDegeri;
    }
}