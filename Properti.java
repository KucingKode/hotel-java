import java.time.Instant;

public class Properti implements DapatDidepresiasi {
    private String nama;
    private Instant tanggalBeli;
    private double hargaBeli;
    private double nilaiResidu;
    private double masaManfaat;

    public Properti(String nama, Instant tanggalBeli, double hargaBeli, double nilaiResidu, double masaManfaat) {
        this.nama = nama;
        this.tanggalBeli = tanggalBeli;
        this.hargaBeli = hargaBeli;
        this.nilaiResidu = nilaiResidu;
        this.masaManfaat = masaManfaat;
    }

    public double getBebanPenyusutan() {
        return (this.getHargaBeli() - this.getNilaiResidu()) / this.getMasaManfaat();
    }

    public double getAkumulasiPenyusutan() {
        double ONE_YEAR = 31536E6;
        double multBeban = (Instant.now().toEpochMilli() - this.getTanggalBeli().toEpochMilli()) / ONE_YEAR;
        return this.getBebanPenyusutan() * multBeban;
    }

    public double getNilaiBuku() {
        return this.getHargaBeli() - this.getAkumulasiPenyusutan();
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Instant getTanggalBeli() {
        return this.tanggalBeli;
    }

    public void setTanggalBeli(Instant tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public double getHargaBeli() {
        return this.hargaBeli;
    }

    public void setHargaBeli(double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public double getNilaiResidu() {
        return this.nilaiResidu;
    }

    public void setNilaiResidu(double nilaiResidu) {
        this.nilaiResidu = nilaiResidu;
    }

    public double getMasaManfaat() {
        return this.masaManfaat;
    }

    public void setMasaManfaat(double masaManfaat) {
        this.masaManfaat = masaManfaat;
    }

    public void tampilkanInfo() {
        System.out.println("nama: " + this.getNama());
        System.out.println("tanggal beli: " + this.getTanggalBeli());
        System.out.println("harga beli: " + this.getHargaBeli());
        System.out.println("nilai residu: " + this.getNilaiResidu());
        System.out.println("masa manfaat: " + this.getMasaManfaat());
        System.out.println("---");
        System.out.println("beban penyusutan: " + this.getBebanPenyusutan());
        System.out.println("akumulasi penyusutan: " + this.getAkumulasiPenyusutan());
        System.out.println("nilai buku: " + this.getNilaiBuku());
    }
}
