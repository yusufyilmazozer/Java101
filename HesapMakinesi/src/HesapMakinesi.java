import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, select;

        System.out.print("İlk Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuç: " + (a + b));
                break;
            case 2:
                System.out.print("Sonuç: " + (a - b));
                break;
            case 3:
                System.out.print("Sonuç: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.print("Sonuç: " + (a / b));
                } else
                    System.out.print("Hatalı Giriş Yaptınız.");
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız.");
        }

    }
}
