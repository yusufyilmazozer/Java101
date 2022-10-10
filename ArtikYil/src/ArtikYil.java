import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year, mod;

        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        mod = year % 4;

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.print(year + " Yılı Artık Bir Yıldır.");
            } else {
                System.out.print(year + " Yılı Artık Bir Yıl Değildir.");
            }
        } else if (mod == 0) {
            System.out.print(year + " Yılı Artık Bir Yıldır.");
        } else {
            System.out.print(year + " Yılı Artık Bir Yıl Değildir.");
        }
    }
}
