import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        Scanner tx = new Scanner(System.in);
        double perKm=2.20,start=10,distance,total;

        System.out.print("Mesafeyi Km Cinsinden Yazınız: ");
        distance = tx.nextDouble();
        total= (distance*perKm)+start;
        if (total<20){
            total =20;
        }
        System.out.print("Ücret: "+total+" Tl");

    }
}
