package soruCözümü_24Agust;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soru3 {
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
    static ArrayList<String> gunler= new ArrayList<>();
    static ArrayList<Double> gunlukKazanc= new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    static double toplamKazanc ;
    static  double ortalamaKazanc;
    static int gunsayisi;

    public static void main(String[] args) {
        gunler.add("pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("pazar");
        System.out.println( gunler);

        int gunsayisi=0;
        double kazanc=0;
        while (gunsayisi<gunler.size()){
            System.out.println(gunler.get(gunsayisi)+ ":" + "kazancinizi giriniz");
            kazanc= scanner.nextDouble();
            gunlukKazanc.add(kazanc);
            toplamKazanc+=kazanc;
            gunsayisi++;
        }
        System.out.println("bir haftalik toplam kazanciniz : "+ toplamKazanc);
        ArrayList<Double> gunlukKazanc= new ArrayList<>();
        System.out.println(gunlukKazanc);
        ortalamaKazanc=(toplamKazanc/gunsayisi);
        System.out.println("Günlük Ortalama Kazanc : " +ortalamaKazanc);

        ortAltiGunler();
        System.out.println(ortAltiGunler());


    }

  private static List<String> ortAltiGunler() {
        List<String> ortAltiGunler=new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            String gun= gunler.get(i);
            double kazanc= gunlukKazanc.get(i);

            if (kazanc< ortalamaKazanc){
                ortAltiGunler.add(gun);
            }
        }
        return ortAltiGunler;
    }
}
