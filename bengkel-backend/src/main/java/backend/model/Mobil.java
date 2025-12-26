package backend.model;

public class Mobil {
    private int id;
    private String noPlat;
    private String merk;
    private String tipe;
    private int tahun;
    private int pelangganId;

    public Mobil(int id, String noPlat, String merk, String tipe, int tahun, int pelangganId) {
        this.id = id;
        this.noPlat = noPlat;
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.pelangganId = pelangganId;
    }

    public String getNoPlat() { return noPlat; }
    public String getMerk() { return merk; }
    public String getTipe() { return tipe; }
    public int getTahun() { return tahun; }
    public int getPelangganId() { return pelangganId; }
}
