package ilk_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // 1. SORU
        //    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        //    Örnek: 12 = 1 1 0 0 (desima ondalik   binary 0 ve bir den olusan sayilar)
        System.out.println("desimal deger giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi = scanner.nextInt();
        System.out.print(sayi+"desimal sayinin binary karsiligi : "+binnaryConvert(sayi));
    }

    public static List<Integer> binnaryConvert(int sayi) {
        List<Integer> binary = new ArrayList<>();
        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;
        }
        List<Integer> tersBinary=new ArrayList<>();
        for (int i = binary.size()-1 ; i >=0 ; i--) {
            tersBinary.add(binary.get(i));
        }

        return tersBinary;
    }

}
