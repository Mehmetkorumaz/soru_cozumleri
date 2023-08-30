package sorucozumu_24_agust_2Etap;

import java.util.ArrayList;
import java.util.Scanner;

public class soru3_mit_Constrakter {
      /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
    yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
    method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
    gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
    kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
            2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
            3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
            4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
            5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
    kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    ortalama kazançtan aşağıysa o günleri return yap.

     */
    String gun;
    double gunlukKazanc;
    static double ortKazanc;
    static double toplam;
   static ArrayList<String> gunler=new ArrayList<String>();
    static ArrayList<soru3_mit_Constrakter> kazanc=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public soru3_mit_Constrakter(String gun, double gunlukKazanc) {
        this.gun = gun;
        this.gunlukKazanc = gunlukKazanc;
    }

    public soru3_mit_Constrakter() {// parametresiz

    }
        void gunlukKazanc(){
       gunler.add("pazartesi");
       gunler.add("Sali");
       gunler.add("Carsamba");
       gunler.add("Persembe");
       gunler.add("Cuma");
       gunler.add("Cumartesi");
       gunler.add("pazar");
       System.out.println( gunler);
       for (int i = 0; i < gunler.size(); i++) {
           System.out.println("lutfen" + gunler.get(i) +  " gore kazancinizi giriniz");
           double gunlukGelir=scanner.nextDouble();
           soru3_mit_Constrakter obj= new soru3_mit_Constrakter();
           kazanc.add(obj);
           System.out.println(kazanc);

       }
   }
   static void gunOrtKazanc(){
      //for (int i = 0; i < kazanc.size(); i++) {
      //    do
      //   // toplam+= kazanc.get(i);
      //}
   }

}
