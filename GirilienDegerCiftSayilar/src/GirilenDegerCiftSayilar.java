import java.util.Scanner;

public class GirilenDegerCiftSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int zero, num;

        System.out.print("Sayı Giriniz: ");
        num = inp.nextInt();
        for (zero = 0; zero <= num; zero++) {
            if ((zero % 3 == 0) && (zero % 4 == 0)) {
                System.out.println(zero);
            }
        }
    }
}
