public class Kare extends GeometrikSekil implements DikCizebilir {

    int kenarUzunluğu;

    public Kare(int kenarUzunluğu) {
        this.kenarUzunluğu = kenarUzunluğu;
    }

    @Override
    public String toString() {
        return (alanBul() + " alanı ve " + cevreBul() + " cevresi olan Kare Şeklimiz oluştu.");
    }

    public void cizimYap() {
        System.out.println("kenar uzunluğu : " + kenarUzunluğu + " karenin cizimi yapılıyor.\n");
    }

    public void dikCizimYap() {
        System.out.println("Köşeleri dik olacak şekilde oluşturuluyor..");
    }

    public int alanBul() {
        AlaniHesapla alan = new AlaniHesapla();
        int alanSonucu = alan.dortgenAlani(kenarUzunluğu, kenarUzunluğu);
        return alanSonucu;
    }

    public int cevreBul() {
        CevreyiHesapla cevre = new CevreyiHesapla();
        int cevreSonucu = cevre.dortgenCevre(kenarUzunluğu, kenarUzunluğu);
        return cevreSonucu;
    }


}






