public abstract class Pelanggan {
    private String nama;
    private String nik;

    public Pelanggan(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public abstract void tampilkanInfo();
}
