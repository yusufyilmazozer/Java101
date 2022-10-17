import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, r, x, ntotal = 1, rtotal = 1, total = 0, xtotal = 1;

        System.out.print("İlk Sayı için Değer Giriniz : ");
        n = input.nextInt();
        System.out.print("İkinci Sayı için Değer Giriniz : ");
        r = input.nextInt();
        x = n - r;

        for (i = 1; i <= n; i++) {
            ntotal *= i;
        }
        for (i = 1; i <= r; i++) {
            rtotal *= i;
        }
        for (i = 1; i <= x; i++) {
            xtotal *= i;
        }
        total = ntotal / (rtotal * xtotal);
        System.out.print("C(n,r)= " + total);
    }
}