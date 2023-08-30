package Soru;

import java.util.Scanner;

public class kahve_sorusu {
    /*
    Basit bir Kahve makinesi oluşturun.
1. Şart
 3 çeşit kahvemiz olsun.
  Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

  Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
2.Şart
  Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
3. Şart
  Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
  sorusunu sorsun.
4. Şart
  Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
  sorusunu sorsun.
Sonuç
   Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */
    static Scanner scanner;
    static String secim;
    static String secim2;
    static String secim3;
    static String secim4;
    public static void main(String[] args) {
        scanner= new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz?");
        System.out.println("1.Türk Kahvesi");
        System.out.println("2.Filtre Kahve");
        System.out.println("3.Expresso \n rakam giriniz : ");
        int secim= scanner.nextInt();

        if (secim<1 && secim>3){
            System.out.println("hatali giris yaptiniz");
        }else {
            switch (secim) {
                case 1:
                    TürkKahvesi();
                    break;
                case 2:
                    FiltreKahve();
                    break;
                case 3:
                    Expresso();
                    break;
                default:
                    System.out.println("hatali rakam girdiniz");
            }
        }
}
    private static void Expresso() {
        System.out.println("Expresso ya Süt eklemek istermisiniz?  :  E: evet  H: hayir");
        secim4 = scanner.next();
        if (secim4.equalsIgnoreCase("E")) {
            System.out.println("Expresso ya Seker eklemek istermisiniz?  :  E: evet  H: hayir");
            secim2 = scanner.next();
            if (secim2.equalsIgnoreCase("E")) {
                System.out.println("Expresso ya hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Expresso  Sütlü-Sekerli-Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Expresso  Sütlü-Sekerli-Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Expresso  Sütlü-Sekerli-Kucuk Boy  Afiyet Olsun  ");
                }
            } else if (secim2.equalsIgnoreCase("H")) {
                System.out.println("Expresso ya hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Expresso Sütlü -Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Expresso Sütlü  -Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Expresso Sütlü  -Kucuk Boy  Afiyet Olsun  ");
                }
            }
        } else  {
            System.out.println("Expresso ya Seker eklemek istermisiniz?  :  E: evet  H: hayir");
            secim2 = scanner.next();
            if (secim2.equalsIgnoreCase("E")) {
                System.out.println("Expresso ya hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Expresso Sekerli-Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Expresso Sekerli-Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Expresso Sekerli-Kucuk Boy  Afiyet Olsun  ");
                }
            } else if (secim2.equalsIgnoreCase("H")) {
                System.out.println("Expresso ya hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy \n harf olarak belirtiniz");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Expresso  -Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Expresso  -Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Expresso  -Kucuk Boy  Afiyet Olsun  ");
                }
            }
        }
    }
    private static void FiltreKahve() {
        System.out.println("Filtre Kahve Süt eklemek istermisiniz?  :  E: evet  H: hayir");
        secim4 = scanner.next();
        if (secim4.equalsIgnoreCase("E")) {
            System.out.println("Filtre Kahve Seker eklemek istermisiniz?  :  E: evet  H: hayir");
            secim2 = scanner.next();
            if (secim2.equalsIgnoreCase("E")) {
                System.out.println("Filtre Kahve hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Filtre Kahve  Sütlü-Sekerli-Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Filtre Kahve Sütlü-Sekerli-Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Filtre Kahve  Sütlü-Sekerli-Kucuk Boy  Afiyet Olsun  ");
                }
            } else if (secim2.equalsIgnoreCase("H")) {
                System.out.println("Filtre Kahve hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Filtre Kahve Sütlü -Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Filtre Kahve Sütlü  -Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Filtre Kahve Sütlü  -Kucuk Boy  Afiyet Olsun  ");
                }
            }
        } else  {
            System.out.println("Filtre Kahve Seker eklemek istermisiniz?  :  E: evet  H: hayir");
            secim2 = scanner.next();
            if (secim2.equalsIgnoreCase("E")) {
                System.out.println("Filtre Kahve hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Filtre Kahve Sekerli-Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Filtre Kahve Sekerli-Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Filtre Kahve Sekerli-Kucuk Boy  Afiyet Olsun  ");
                }
            } else if (secim2.equalsIgnoreCase("H")) {
                System.out.println("Filtre Kahve hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy \n harf olarak belirtiniz");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Filtre Kahve -Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Filtre Kahve  -Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Filtre Kahve  -Kucuk Boy  Afiyet Olsun  ");
                }
            }

        }
    }

    private static void TürkKahvesi() {
        System.out.println("Türk Kahvesi Süt eklemek istermisiniz?  :  E: evet  H: hayir");
        secim4 = scanner.next();
        if (secim4.equalsIgnoreCase("E")) {
            System.out.println("Türk Kahvesi  Seker eklemek istermisiniz?  :  E: evet  H: hayir");
            secim2 = scanner.next();
            if (secim2.equalsIgnoreCase("E")) {
                System.out.println("Türk Kahvesi  hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Türk Kahvesi   Sütlü-Sekerli-Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Türk Kahvesi   Sütlü-Sekerli-Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Türk Kahvesi   Sütlü-Sekerli-Kucuk Boy  Afiyet Olsun  ");
                }
            } else if (secim2.equalsIgnoreCase("H")) {
                System.out.println("Türk Kahvesi  hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Türk Kahvesi  Sütlü -Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Türk Kahvesi  Sütlü  -Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Türk Kahvesi  Sütlü  -Kucuk Boy  Afiyet Olsun  ");
                }
            }
        } else  {
            System.out.println("Türk Kahvesi  Seker eklemek istermisiniz?  :  E: evet  H: hayir");
            secim2 = scanner.next();
            if (secim2.equalsIgnoreCase("E")) {
                System.out.println("Türk Kahvesi  hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy ");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Türk Kahvesi  Sekerli-Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Türk Kahvesi  Sekerli-Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Türk Kahvesi  Sekerli-Kucuk Boy  Afiyet Olsun  ");
                }
            } else if (secim2.equalsIgnoreCase("H")) {
                System.out.println("Türk Kahvesi  hangi boyutta olsun? \nB: Büyük Boy  \nO: Orta Boy  \nK : Kücük Boy \n harf olarak belirtiniz");
                secim3 = scanner.next();
                if (secim3.equalsIgnoreCase("B")) {
                    System.out.println("Türk Kahvesi   -Büyük Boy  Afiyet Olsun  ");
                } else if (secim3.equalsIgnoreCase("O")) {
                    System.out.println("Türk Kahvesi  -Orta Boy  Afiyet Olsun  ");
                } else {
                    System.out.println("Türk Kahvesi  -Kucuk Boy  Afiyet Olsun  ");
                }
            }

        }

    }
    }
