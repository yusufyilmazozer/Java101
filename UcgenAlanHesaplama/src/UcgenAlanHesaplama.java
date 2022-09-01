import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner hip = new Scanner(System.in);
        double a, b, c, u, x;
        Scanner input = new Scanner(System.in);

        System.out.print("A kenarını Giriniz: ");
        a = input.nextDouble();
        System.out.print("B kenarını Giriniz: ");
        b = input.nextDouble();
        System.out.print("C kenarını Giriniz: ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        System.out.println("Üçgenin Çevresi= " + 2*u + " Birim");

        x = u*(u-a)* (u-b)* (u-c);
        System.out.print("Üçgenin Alanı= " + Math.sqrt(x) + " Birim kare");
    }
}
