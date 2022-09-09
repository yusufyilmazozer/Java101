import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi=3.14,r,area,environment,a;

        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = inp.nextDouble();
        System.out.print("Dairenin Merkez Açısını Giriniz: ");
        a = inp.nextDouble();

        area = pi * r * r;
        environment = 2 * pi * r;

        System.out.println("Dairenin Alanı: "+ area);
        System.out.println("Dairenin Çevresi: "+ environment);
        System.out.print("Daire Diliminin Alanı: "+ (pi * (r*r) * a) / 360);
    }
}
