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