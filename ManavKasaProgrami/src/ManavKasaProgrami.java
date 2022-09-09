import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pear,apple,tomato,banana,eggplant,total;

        System.out.print("Armut Kaç Kil0? :");
        pear = inp.nextDouble();
        System.out.print("Elma Kaç Kil0? :");
        apple = inp.nextDouble();
        System.out.print("Domates Kaç Kil0? :");
        tomato = inp.nextDouble();
        System.out.print("Muz Kaç Kil0? :");
        banana = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kil0? :");
        eggplant = inp.nextDouble();

        total = (pear*2.14)+(apple*3.67)+(tomato*1.11)+(banana*0.95)+(eggplant*5);

        System.out.print("Toplam Tutar: "+ total);
    }
}
