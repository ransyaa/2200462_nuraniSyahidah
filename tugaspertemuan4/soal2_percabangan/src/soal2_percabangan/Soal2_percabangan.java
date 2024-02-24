/*
Nurani Syahidah - 2200462
Pendidikan ilmu komputer A 2022

soal 2 genap 
Buatlah algoritma dalam bahasa Java, yang menerima tiga buah angka 
masukan dan menampilkan nilai yang paling besar dari ketiga masukan.
 */
package soal2_percabangan;
import java.util.Scanner;
public class Soal2_percabangan {
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

        // Menemukan nilai terbesar menggunakan percabangan if-else
        int nilai = Terbesar(angka1, angka2, angka3);

        // Output
        System.out.println("Nilai terbesar dari ketiga angka adalah: " + nilai);
    }

    public static int Terbesar(int a, int b, int c) {
        // Menggunakan percabangan if-else untuk menemukan nilai terbesar
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}