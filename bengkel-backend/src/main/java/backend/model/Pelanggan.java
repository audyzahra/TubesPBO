package backend.model;

public class Pelanggan {
    private int id;
    private String nama;
    private String noHp;
    private String alamat;

    public Pelanggan(int id, String nama, String noHp, String alamat) {
        this.id = id;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public String getAlamat() { return alamat; }
}
