enum StatusKamar {
    DIPESAN,
    KOSONG
}

class Kamar implements DapatDipesan {
    private String id;
    private double hargaPerMalam;
    private StatusKamar status;

    public Kamar(String id, double hargaPerMalam, StatusKamar status) {
        this.id = id;
        this.hargaPerMalam = hargaPerMalam;
        this.status = status;
    }

    public void pesan() {
        this.status = StatusKamar.DIPESAN;
    }

    public void batalkanPesanan() {
        this.status = StatusKamar.KOSONG;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusKamar getStatus() {
        return this.status;
    }

    public void setStatus(StatusKamar status) {
        this.status = status;
    }

    public double getHargaPerMalam() {
        return this.hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public void tampilkanInfo() {
        System.out.println("id: " + this.getId());
        System.out.println("harga per malam: " + this.getHargaPerMalam());
        System.out.println("status: " + this.getStatus());
    }
}