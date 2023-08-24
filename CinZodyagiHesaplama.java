import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String cinZodyagiBurcu = getCinZodyagiBurcu(dogumYili);

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagiBurcu);

        scanner.close();
    }

    public static String getCinZodyagiBurcu(int dogumYili) {
        String[] cinZodyagiSembolleri = {
            "Maymun", "Horoz", "Köpek", "Domuz",
            "Fare", "Öküz", "Kaplan", "Tavşan",
            "Ejderha", "Yılan", "At", "Koyun"
        };

        int indeks = dogumYili % 12;
        return cinZodyagiSembolleri[indeks];
    }
}
