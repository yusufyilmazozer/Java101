import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;

        System.out.print("Birinci Sayı: ");
        a = inp.nextInt();
        System.out.print("İkinci Sayı: ");
        b = inp.nextInt();
        System.out.print("Üçüncü Sayı: ");
        c = inp.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print(c + "<" + b + "<" + a);

            } else {
                System.out.print(b + "<" + c + "<" + a);
            }

        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print(c + "<" + a + "<" + b);

            } else {
                System.out.print(a + "<" + c + "<" + b);
            }

        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.print(b + "<" + a + "<" + c);

            } else {
                System.out.print(a + "<" + b + "<" + c);
            }

        }

    }
}
