import java.util.Scanner;

public class CiftveDordunKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num, total = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            num = inp.nextInt();
            if (num % 4 == 0) {
                total += num;
            }

        } while (num % 2 == 0);
        System.out.print("Toplam Sayı: " + total);

    }
}
