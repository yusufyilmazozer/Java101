import java.util.Scanner;

public class BasamakSayilariTop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int basValue = 0, number = inp.nextInt();

        while (number != 0) {
            basValue += number % 10;
            number /= 10;
        }
        System.out.print(basValue);
    }
}