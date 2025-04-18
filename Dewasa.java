import java.time.Instant;

public class Dewasa extends Pelanggan {
    public Dewasa(String nama, String nik) {
        super(nama, nik);
    }

    public Reservasi buatReservasi(Kamar kamar, Pelanggan[] listPelanggan, Instant tanggalCheckIn, int jumlahMalam) {
        return new Reservasi(kamar, listPelanggan, jumlahMalam, tanggalCheckIn);
    }

    public void tampilkanInfo() {
        System.out.println("nama: " + this.getNama());
        System.out.println("nik: " + this.getNik());
    }
}
