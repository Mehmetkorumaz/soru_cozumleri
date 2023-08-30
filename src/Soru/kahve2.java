package Soru;

import java.util.Scanner;

public class kahve2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz?\n" + " 1.Türk kahvesi\n" + " 2.Filtre Kahve\n" + " 3.Espresso");
        int tercih = scanner.nextInt();
        System.out.println("Süt eklemek istemisiniz?");
        String sut = scanner.next();
        System.out.println("Şeker ister misiniz");
        String seker = scanner.next().toLowerCase();
        System.out.println("Hangi boyutta olsun?\n1-Büyük Boy\n2-Orta Boy\n3-Küçük Boy");
        int boy = scanner.nextInt();
        if (tercih == 1) {
            System.out.print("Türk kahvesi");
        } else if (tercih == 2) {
            System.out.print("Filtre Kahve");
        } else if (tercih == 3) {
            System.out.print("Espresso");
        }
        if (sut.equalsIgnoreCase("evet")) {
            System.out.print(" sütlü ve");
        } else if (sut.equalsIgnoreCase("hayır")) {
            System.out.print(" sütsüz ve");
        }
        if (seker.equalsIgnoreCase("evet")) {
            System.out.print(" şekerli");
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.print(" şekersiz");
        }
        if (boy == 1) {
            System.out.print(" büyük boy");
        } else if (boy == 2) {
            System.out.print(" orta boy");
        } else if (boy == 3) {
            System.out.print(" küçük boy");
        }
        System.out.print(" kahveniz hazırdır.");
    }
}
