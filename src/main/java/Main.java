import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<GeometrikSekil> geoList = new ArrayList<GeometrikSekil>();
        while (true) {
            System.out.println("");
            System.out.println("1.Kare");
            System.out.println("2.Dikdörtgen");
            System.out.println("3.Daire");
            System.out.println("4.Listele");
            System.out.println("5.Çıkış");
            Scanner input = new Scanner(System.in);
            int sonuc = input.nextInt();
            GeometrikSekil sekil;
            switch (sonuc) {
                case 1:
                    System.out.println("uzunluk girin");
                    int kareUzunluk = input.nextInt();
                    sekil = new Kare(kareUzunluk);
                    sekil.cizimYap();
                    //sekil.dikCizimYap();
                    System.out.println("Karenin alanı : " + sekil.alanBul());
                    System.out.println("Karenin cevresi: " + sekil.cevreBul());
                    sekil.sekil();
                    geoList.add(sekil);
                    break;
                case 2:
                    System.out.println("uzun kenar ve kısa kenar değerlerini girin");
                    int uzunKenar = input.nextInt();
                    int kisaKenar = input.nextInt();
                    sekil = new Dikdörtgen(uzunKenar, kisaKenar);
                    sekil.cizimYap();
                    //sekil.dikCizimYap();
                    System.out.println("Dikdörtgenin alanı : " + sekil.alanBul());
                    System.out.println("Dikdörtgenin cevresi: " + sekil.cevreBul());
                    sekil.sekil();
                    geoList.add(sekil);
                    break;
                case 3:
                    System.out.println("yarıçap değerini girin");
                    int yaricap = input.nextInt();
                    sekil = new Cember(yaricap);
                    sekil.cizimYap();
                    //sekil.dikCizimYap();
                    System.out.println("Cemberin alanı : " + sekil.alanBul());
                    System.out.println("Cemberin cevresi: " + sekil.cevreBul());
                    sekil.sekil();
                    geoList.add(sekil);
                    break;
                case 4:
                    for (GeometrikSekil geo : geoList) {
                        System.out.println(geo);
                    }
                case 5:
                    break;

            }
        }

    }
}
