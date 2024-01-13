import java.util.Scanner;

public class proje4EnBüyükSayıveSırasınıBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enBuyukSayi = Integer.MIN_VALUE;
        int sira = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
                sira = i;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("Girildiği sıra: " + sira);

        scanner.close();
    }
}
