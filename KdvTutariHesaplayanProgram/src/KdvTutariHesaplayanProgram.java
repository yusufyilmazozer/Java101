import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double girdi, kdvTutari, total;

        System.out.print("Tutarı giriniz: ");
        girdi = inp.nextDouble();
        kdvTutari = girdi<=1000 ? 0.18 : 0.08;
        total = girdi+(girdi*kdvTutari);
        
        System.out.println("Kdv`siz Fiyat: "+girdi);
        System.out.println("Kdv`li Fiyat: "+ total);
        System.out.print("Kdv Tutarı: "+kdvTutari*girdi);
    }
}
