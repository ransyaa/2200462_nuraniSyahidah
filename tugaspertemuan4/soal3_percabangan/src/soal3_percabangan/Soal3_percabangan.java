/*
Nurani Syahidah - 2200462
Pendidikan ilmu komputer A 2022

soal 3 genap 
Menentukan biaya parkir berdasarkan lama parkir yang dihitung berdasarkan 
selisih jam masuk dan jam keluar (dengan ketentuan seperti soal no 1). 
Biaya parkir 2 jam pertama 1500 dan perjam berikutnya 1000. Contoh:

Jam Masuk	Jam Keluar	Lama Parkir	Tarif Parkir (Rp)
8	9	1 Jam	1500
8	11	Lama Parkir 3 Jam	2500
11	3	Lama Parkir 4 Jam	3500
10	8	Lama Parkir 10 Jam	9500

 */
package soal3_percabangan;
import java.util.Scanner;
public class Soal3_percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        System.out.print("Masukkan jam masuk parkir: ");
        int jamMasuk = scanner.nextInt();
        System.out.print("Masukkan jam keluar parkir: ");
        int jamKeluar = scanner.nextInt();

        // Menghitung lama parkir
        int lamaParkir = hitungLamaParkir(jamMasuk, jamKeluar);

        // Menghitung biaya parkir
        int biayaParkir = hitungBiayaParkir(lamaParkir);

        // Output
        System.out.println("Lama parkir: " + lamaParkir + " Jam");
        System.out.println("Tarif parkir: Rp." + biayaParkir);
    }

    public static int hitungLamaParkir(int jamMasuk, int jamKeluar) {
        int lamaParkir;
        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = (12 - jamMasuk) + jamKeluar;
        }
        return lamaParkir;
    }

    public static int hitungBiayaParkir(int lamaParkir) {
        int biayaParkir;

        if (lamaParkir <= 2) {
            biayaParkir = 1500;
        } else {
            biayaParkir = 1500 + (lamaParkir - 2) * 1000;
        }

        return biayaParkir;
    }
}
