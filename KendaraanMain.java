package Soal1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * KendaraanMain
 */
public class KendaraanMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        ArrayList<TransaksiPajak> daftarTransaksi = new ArrayList<>();

        // Contoh inisialisasi objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("S 4567 YV", "Bakso", "Mobil", 2000, 2012, 4);
        Kendaraan kendaraan2 = new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        Kendaraan kendaraan3 = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        Kendaraan kendaraan4 = new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
        daftarKendaraan.add(kendaraan1);
        daftarKendaraan.add(kendaraan2);
        daftarKendaraan.add(kendaraan3);
        daftarKendaraan.add(kendaraan4);

        int pilihan;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan Nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                System.out.println("\nDaftar Kendaraan:");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.printf("| %-12s | %-12s | %-10s | %-12s | %-5s | %-17s |\n",
                        "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                for (Kendaraan kendaraan : daftarKendaraan) {
                    System.out.printf("| %-12s | %-12s | %-10s | %-12d | %-5d | %-17d |\n",
                            kendaraan.noTNKB, kendaraan.nama, kendaraan.jenis, kendaraan.cc, kendaraan.tahun, kendaraan.bulanHarusBayar);
                }
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                case 2:
                System.out.println("\nMasukkan nomor TNKB kendaraan yang akan dibayar pajak:");
                String noTNKB = input.nextLine();
        
                Kendaraan kendaraanTerpilih = null;
                for (Kendaraan kendaraan : daftarKendaraan) {
                    if (kendaraan.noTNKB.equals(noTNKB)) {
                        kendaraanTerpilih = kendaraan;
                        break;
                    }
                }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pilihan != 5);
        
        input.close();
    }
}