import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,tr,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Tarih Notunu Giriniz: ");
        tarih = inp.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        tr = inp.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        muzik = inp.nextInt();

        double sonuc = (mat+fizik+kimya+tarih+tr+muzik)/6.0;
        System.out.println("Not Ortalamanız: " + sonuc);
        System.out.print(sonuc > 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
    }
}
