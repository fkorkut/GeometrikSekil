public class CevreyiHesapla {

    static double pi = 3.14;

    public int dortgenCevre(int uzunKenar, int kısaKenar) {
        int islemSonucu;
        islemSonucu = (uzunKenar + kısaKenar) * 2;
        return islemSonucu;
    }

    public double cemberCevresi(int yaricap) {
        double islemSonucu;
        islemSonucu = 4 * pi * yaricap;
        return islemSonucu;
    }
}