import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        int mod,year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("doğum yılınızı giriniz");
        year= scanner.nextInt();
        mod=year%12;
        switch(mod){
            case 0:
                System.out.println("çin zodyağı burcunuz= maymun");

                break;
            case 1:
                System.out.println("çin zodyağı burcunuz= horoz");

                break;
            case 2:
                System.out.println("çin zodyağı burcunuz= köpek");

                break;
            case 3:
                System.out.println("çin zodyağı burcunuz= domuz");

                break;
            case 4:
                System.out.println("çin zodyağı burcunuz= fare");

                break;
            case 5:
                System.out.println("çin zodyağı burcunuz= öküz");

                break;
            case 6:
                System.out.println("çin zodyağı burcunuz= kaplan");

                break;
            case 7:
                System.out.println("çin zodyağı burcunuz= tavşan");

                break;
            case 8:
                System.out.println("çin zodyağı burcunuz= ejderha");

                break;
            case 9:
                System.out.println("çin zodyağı burcunuz= yılan");

                break;
            case 10:
                System.out.println("çin zodyağı burcunuz= at");

                break;
            case 11:
                System.out.println("çin zodyağı burcunuz= koyun");

                break;
        }
    }
}
/* Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

 */