import java.util.Scanner;

/*İşleri Biraz geliştirmek adına
Ders kredilerini de işin içine kattım */
public class NotHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float mat, tr, phy, che, mus, pay = 0, payda = 0;

        System.out.print("Matematik Notunu Giriniz: ");
        mat = inp.nextFloat();
        if (mat > 0 && mat < 101) {
            pay += mat * 6;
            payda += 6;
        }
        System.out.print("Türkçe Notunu Giriniz: ");
        tr = inp.nextFloat();
        if (tr > 0 && tr < 101) {
            pay += tr * 6;
            payda += 6;
        }
        System.out.print("Fizik Notunu Giriniz: ");
        phy = inp.nextFloat();
        if (phy > 0 && phy < 101) {
            pay += phy * 4;
            payda += 4;
        }
        System.out.print("Kimya Notunu Giriniz: ");
        che = inp.nextFloat();
        if (che > 0 && che < 101) {
            pay += che * 4;
            payda += 4;
        }
        System.out.print("Müzik Notunu Giriniz: ");
        mus = inp.nextFloat();
        if (mus > 0 && mus < 101) {
            pay += mus * 2;
            payda += 2;
        }
        pay /= payda;
        System.out.println(pay > 55 ? "Tebrikler Sınıfı Geçiniz." : "Sınıfı Geçemediniz");
        System.out.print("Ortalamanız: " + pay);
    }
}