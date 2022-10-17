import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, n, total = 1;

        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        x = inp.nextInt();
        System.out.print("Üssü Giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total *= x;
        }
        System.out.print(total);
    }
}
