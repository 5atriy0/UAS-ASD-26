package Soal1;

/**
 * Kendaraan
 */
public class Kendaraan {

    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public void cetakInfoKendaraan() {
        System.out.println("Kendaraan:");
        System.out.println("Nomor TNKB: " + noTNKB);
        System.out.println("Nama Pemilik: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("CC: " + cc);
        System.out.println("Tahun: " + tahun);
        System.out.println("Bulan Harus Bayar: " + bulanHarusBayar);
    }
}