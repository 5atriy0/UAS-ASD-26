package Soal1;

/**
 * TransaksiPajak
 */
public class TransaksiPajak {

    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;

    TransaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }

    public void cetakInfoTransaksi() {
        System.out.println("Transaksi Pajak:");
        System.out.println("Kode Transaksi: " + kode);
        System.out.println("Nominal Bayar: " + nominalBayar);
        System.out.println("Denda: " + denda);
        System.out.println("Bulan Bayar: " + bulanBayar);
        System.out.println("Kendaraan:");
        System.out.println("Nomor TNKB: " + kendaraan.noTNKB);
        System.out.println("Nama Pemilik: " + kendaraan.nama);
        System.out.println("Jenis: " + kendaraan.jenis);
        System.out.println("CC: " + kendaraan.cc);
        System.out.println("Tahun: " + kendaraan.tahun);
        System.out.println("Bulan Harus Bayar: " + kendaraan.bulanHarusBayar);
    }

    public void bayarPajak() {
        long tarif = 0;
        if (kendaraan.jenis.equalsIgnoreCase("motor")) {
            if (kendaraan.cc < 100) {
                tarif = 100000;
            } else if (kendaraan.cc >= 100 && kendaraan.cc <= 250) {
                tarif = 250000;
            } else if (kendaraan.cc > 250) {
                tarif = 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("mobil")) {
            if (kendaraan.cc < 1000) {
                tarif = 750000;
            } else if (kendaraan.cc >= 1000 && kendaraan.cc <= 2500) {
                tarif = 1000000;
            } else if (kendaraan.cc > 2500) {
                tarif = 1500000;
            }
        }

        long totalBayar = tarif;
        int telat = bulanBayar - kendaraan.bulanHarusBayar;

        if (telat > 0) {
            if (telat <= 3) {
                denda = telat * 50000;
            } else {
                denda = 3 * 50000 + (telat - 3) * 50000;
            }
        }

        nominalBayar = totalBayar + denda;
    }
}