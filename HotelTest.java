import java.time.Instant;

public class HotelTest {
    public static void main(String[] args) {
        Instant tanggalMasuk = Instant.parse("2021-02-09T00:00:00.00Z");
        Instant tanggalBeliBantal = Instant.parse("2025-03-11T00:00:00.00Z");
        Instant tanggalBeliGuling = Instant.parse("2025-03-11T00:00:00.00Z");

        Kamar kamar1 = new Kamar("1a", 10_000, StatusKamar.kosong);
        Dewasa ortu = new Dewasa("abdul", "3216211897654");
        Anak anak = new Anak("abdul jr.", "3216205671624357", ortu);

        Reservasi reservasi = ortu.buatReservasi(kamar1, new Pelanggan[] { ortu, anak }, tanggalMasuk, 2);
        reservasi.bayar();

        Properti bantal = new Properti("bantal", tanggalBeliBantal, 10_000, 100, 2);
        Properti guling = new Properti("guling", tanggalBeliGuling, 20_000, 100, 2);

        bantal.tampilkanInfo();
        System.out.println();
        guling.tampilkanInfo();
    }
}
