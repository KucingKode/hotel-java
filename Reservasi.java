import java.time.Instant;

enum StatusReservasi {

}

public class Reservasi implements DapatDibayar {
    private Kamar kamar;
    private Pelanggan[] daftarPelanggan;
    private int jumlahMalam;
    private Instant tanggalMasuk;

    public Reservasi(Kamar kamar, Pelanggan[] daftarPelanggan, int jumlahMalam, Instant tanggalMasuk) {
        this.kamar = kamar;
        this.daftarPelanggan = daftarPelanggan;
        this.jumlahMalam = jumlahMalam;
        this.tanggalMasuk = tanggalMasuk;
    }

    public void bayar() {
        this.kamar.pesan();
    }

    public void batalkan() {
        this.kamar.batalkanPesanan();
    }

    public double getTotal() {
        return this.daftarPelanggan.length * this.kamar.getHargaPerMalam();
    }

    public Kamar getKamar() {
        return this.kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public Pelanggan[] getDaftarPelanggan() {
        return this.daftarPelanggan;
    }

    public void setDaftarPelanggan(Pelanggan[] daftarPelanggan) {
        this.daftarPelanggan = daftarPelanggan;
    }

    public int getJumlahMalam() {
        return this.jumlahMalam;
    }

    public void setJumlahMalam(int jumlahMalam) {
        this.jumlahMalam = jumlahMalam;
    }

    public Instant getTanggalMasuk() {
        return this.tanggalMasuk;
    }

    public void setTanggalMasuk(Instant tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public void tampilkanInfo() {
        System.out.println("-- kamar: --");
        this.kamar.tampilkanInfo();
        System.out.println("-----");
        System.out.println("-- daftar pelanggan: --");
        for (Pelanggan pelanggan : daftarPelanggan) {
            pelanggan.tampilkanInfo();
        }
        System.out.println("-----");

        System.out.println("jumlah malam: " + this.getJumlahMalam());
        System.out.println("tanggal masuk: " + this.getTanggalMasuk());

        

    }
}
