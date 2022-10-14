import java.util.Scanner;

public class DortveBesinKatlari {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int i = 1, v = 1, n;
        System.out.print("Sayı Giriniz: ");
        n = inp.nextInt();
        while (i <= n) {
            System.out.println(i);
            i *= 4;
            if (v <= n) {
                System.out.println(v);
                v *= 5;

            }
        }
    }
}
