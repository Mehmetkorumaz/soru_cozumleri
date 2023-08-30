package soruCözümü_24Agust;

import java.util.Scanner;

public class soru2 {
    /*
       * Basit bir 5 ürünlü manav alisveris programi yaziniz.

      1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
      2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
                bitirmek isteyene kadar tekrarla.
      3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
      4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
        */
    static Scanner scanner = new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;
    static double tutar;

    public static void main(String[] args) {
        Giris();
    }
    private static void Giris() {
        System.out.println("=================== Baskent Manava =================");
        System.out.println("=================    Hoşgeldiniz     =================");
        System.out.println("-----------------       Menü         -----------------");
        System.out.println("1 - Manav Ürünleri \n2 - Çıkış\n ");
        System.out.println("lutfen yapacaginiz islem numarasini giriniz");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:
                ManavUrunleri();
                break;
            case 2:
                Cikis();
            default:
                System.out.println("hatali giris yaptiniz");
        }
    }
    private static void Cikis() {
        System.exit(0);
    }

    private static void ManavUrunleri() {
        System.out.println("Almak istediginiz Ürünün Numarasini Giriniz\n1 - Muz  2 €\n2 - Üzüm  4,5€\n3 - Patates  1€\n4 - Sogan  1€\n5 - Karnibahar  2€");
        while (!ekUrun){
            urunKodu = scanner.nextInt();
            if (urunKodu>=1 && urunKodu<=5){
                System.out.println("Kac kg alacaksiniz");
                urunMiktari= scanner.nextDouble();
                switch (urunKodu){
                    case 1:
                        urunAdi = "Muz";
                        urunFiyati = 2;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 2:
                        urunAdi = "Üzüm";
                        urunFiyati = 4.5;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 3:
                        urunAdi = "Patates";
                        urunFiyati = 1;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 4:
                        urunAdi = "Sogan";
                        urunFiyati = 1;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 5:
                        urunAdi = "Karnibahar";
                        urunFiyati = 4.5;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    default:
                        System.out.println("hatali giris yaptiniz");
                }
                tutar=urunFiyati*urunMiktari;
                toplam+=tutar;
                System.out.println("Oluşan Sepet Tutarı: "+toplam);
                sepet+=urunAdi+" : "+tutar+" € \n";
                System.out.println("Başka ürün almak isterseniz Ürün kodunu giriniz. Cikis icin 0 tuşuna basınız.");

            } else if (urunKodu==0) {
                Cikis();

            }
        }
    }
}
