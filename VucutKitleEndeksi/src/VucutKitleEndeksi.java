import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double height,index;
        int weight;

        System.out.print("Boyunuzu Giriniz: ");
        height = inp.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        weight = inp.nextInt();

        index = weight / (height*height) ;

        System.out.print("Vücut Kitle İndeksiniz: "+ index);
    }
}
