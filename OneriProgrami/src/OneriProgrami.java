import java.util.Scanner;

public class OneriProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temp;
        System.out.print("Hava Sıcaklığını Giriniz: ");
        temp = inp.nextInt();
        if (temp < 5) {
            System.out.print("Kayak Yapmanızı Öneriyoruz.");
        }
        if (temp > 4 && temp < 16) {
            System.out.println("Sinemaya Gitmenizi Öneriyoruz.");
        }
        if (temp > 9 && temp < 26) {
            System.out.print("Piknik Yapmanızı Öneriyoruz.");
        }
        if (temp > 25)
            System.out.print("Yüzmenizi Öneriyoruz.");
    }
}
