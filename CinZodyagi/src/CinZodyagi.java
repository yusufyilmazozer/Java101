import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year, mod;
        String zod = "";

        System.out.print("Doğum Yılınızı Giriniz: ");
        year = inp.nextInt();

        mod = year % 12;

        switch (mod) {
            case 0:
                zod = "Maymun";
                break;
            case 1:
                zod = "Horoz";
                break;
            case 2:
                zod = "Köpek";
                break;
            case 3:
                zod = "Domuz";
                break;
            case 4:
                zod = "Fare";
                break;
            case 5:
                zod = "Öküz";
                break;
            case 6:
                zod = "Kaplan";
            case 7:
                zod = "Tavşan";
                break;
            case 8:
                zod = "Ejderha";
            case 9:
                zod = "Yılan";
                break;
            case 10:
                zod = "At";
                break;
            case 11:
                zod = "Koyun";
            default:
                System.out.print("Hatalı Giriş Yaptınız.");
        }
        System.out.print("Çin Zodyağı Burcunuz: "+zod);
    }
}

/*
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