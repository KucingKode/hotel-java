public class Anak extends Pelanggan {
    private Dewasa orangTua;

    public Anak(String nama, String nik, Dewasa orangTua) {
        super(nama, nik);
        this.orangTua = orangTua;
    }

    public Dewasa getOrangTua() {
        return this.orangTua;
    }

    public void setOrangTua(Dewasa orangTua) {
        this.orangTua = orangTua;
    }

    public void tampilkanInfo() {
        System.out.println("nam: " + this.getNama());
        System.out.println("nik: " + this.getNik());
        System.out.println("orang tua: " + this.orangTua.getNama() + " (" + this.orangTua.getNik() + ")");
    }
}
