import java.util.Scanner;

public class HarmonicSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double result = 0;
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();

        for (double i = 1; i <= n; i++){
            result += 1/i;
        }
        System.out.print(result);
    }
}
