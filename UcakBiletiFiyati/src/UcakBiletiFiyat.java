import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km, age, typ;
        double perkm = 0.10, disChild = 0.5, disMid = 0.1, disOld = 0.30, disDouble = 0.20, total;

        System.out.print("Gideceğiniz Mesafeyi Kilometre Cinsinden Yazınız: ");
        km = inp.nextInt();
        System.out.print("Yaşınızı Yazınız: ");
        age = inp.nextInt();
        System.out.print("Tek Yön ise 1 Gidiş-Dönüş ise 2 Yazınız: ");
        typ = inp.nextInt();

        if ((km > 0 && age > 0) && (typ == 1 || typ == 2)) {
            total = km *= perkm;
            if (age < 12) {
                total = total - (total * disChild);
            } else if (age >= 12 && age <= 24) {
                total = total - (total * disMid);
            } else if (age > 65) {
                total = total - (total * disOld);
            }
            if (typ == 2) {
                total = total - (total * disDouble);
            }
            System.out.print("Toplam Tutar: " + total + "Tl.");
        } else {
            System.out.print("Hatalı Giriş Yaptınız.");
        }
    }
}

/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını
 hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi
ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
 */
