public class AlaniHesapla {

    static double pi = 3.14;

    public int dortgenAlani(int uzunKenar, int kısaKenar) {
        int islemSonucu;
        islemSonucu = uzunKenar * kısaKenar;
        return islemSonucu;
    }

    public double cemberAlani(int yaricap) {
        double islemSonucu;
        islemSonucu = pi * (yaricap * yaricap);
        return islemSonucu;
    }
}
