import java.util.Scanner;

public class KullaniciAdiSifre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, change, npassword;

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = inp.nextLine();

        if (userName.equals("java101") && password.equals("patikasi")) {
            System.out.print("Giriş Yaptınız.");
        } else {
            System.out.print("Yeni şifre oluşturmak için 1 yazınız: ");
            change = inp.nextLine();

            if (change.equals("1")) {
                System.out.print("Yeni şifreyi Giriniz: ");
                npassword = inp.nextLine();
                if (npassword.equals("patikasi")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Yeni Şifreniz oluşturuldu.");
                }
            } else {
                System.out.print("Şifreniz oluşturulmadı.");
            }
        }
    }
}
