/*
Nurani Syahidah - 2200462
Pendidikan ilmu komputer A 2022

soal 1 genap 
Buatlah algoritma dalam bahasa Java, yang menerima masukan 
berupa 3 buah integer, periksa apakah masukan adalah ribuan.
 */
package soal1_percabangan;
import java.util.Scanner;
public class Soal1_percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        System.out.println("Masukkan 3 angka integer! ");
        System.out.print("Angka 1 : ");
        int angka1 = scanner.nextInt();
        System.out.print("Angka 2 : ");
        int angka2 = scanner.nextInt();
        System.out.print("Angka 3 : ");
        int angka3 = scanner.nextInt();
        // Memeriksa apakah angka 1 adalah ribuan
        if (isRibuan(angka1)) {
            System.out.println("Angka " + angka1 + " adalah angka ribuan.");
        } else {
            System.out.println("Angka " + angka1 + " bukan angka ribuan.");
        }
        // Memeriksa apakah angka 2 adalah ribuan
        if (isRibuan(angka2)) {
            System.out.println("Angka " + angka2 + " adalah angka ribuan.");
        } else {
            System.out.println("Angka " + angka2 + " bukan angka ribuan.");
        }
        // Memeriksa apakah semua angka 3 adalah ribuan
        if (isRibuan(angka3)) {
            System.out.println("Angka " + angka3 + " adalah angka ribuan.");
        } else {
            System.out.println("Angka " + angka3 + " bukan angka ribuan.");
        }
    }
    public static boolean isRibuan(int angka) {
        // Memeriksa apakah angka adalah ribuan
        return angka >= 1000 && angka <= 9999;
    }
}