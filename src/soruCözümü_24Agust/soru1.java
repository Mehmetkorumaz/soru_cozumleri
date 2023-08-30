package soruCözümü_24Agust;

import java.util.Scanner;

public class soru1 {
    /*
    * Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */
    static  Scanner scanner=new Scanner(System.in);
    double sonuc;
    public static void main(String[] args) {
        scanner=new Scanner(System.in);
        System.out.println("lutfen yapacaginiz islemi seciniz \n" +
                "1-'+' Toplama islemi\n" +
                "2-'-' Cikarma islemi\n" +
                "3-'*' Carpma islemi\n" +
                "4-'/' Bölme islemi\n" +
                "5-Cikis");

        int secim= scanner.nextInt();
        switch (secim){
            case 1:
                toplama();
            case 2:
                Cikarma();
            case 3:
                Carpma();
            case 4:
                Bölme();
            case 5:
            default:
                System.out.println("hatali giris yaptiniz");
        }

    }

    private static void Bölme() {
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        if(sayi1>sayi2){
            double sonuc =sayi1/sayi2;
            System.out.println("Sonuc : "+ sonuc);
        }else {
            System.out.println("ilk sayiniz birinci sayidan büyük olmak zorundadir");
        }


    }

    private static void Carpma() {
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sonuc =sayi1*sayi2;
        System.out.println("Sonuc : "+ sonuc);
    }

    private static void Cikarma() {
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sonuc =sayi1-sayi2;
        System.out.println("Sonuc : "+ sonuc);
    }

    private static void toplama() {
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sonuc =sayi1+sayi2;
        System.out.println("Sonuc : "+ sonuc);

    }
}
