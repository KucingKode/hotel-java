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
}
