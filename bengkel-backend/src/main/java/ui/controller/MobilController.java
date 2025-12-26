package ui.controller;

import backend.dao.MobilDAO;
import backend.model.Mobil;

public class MobilController {

    public void tambahMobil(String plat, String merk, String tipe, int tahun, int pelangganId) {
        try {
            MobilDAO dao = new MobilDAO();
            dao.insert(new Mobil(0, plat, merk, tipe, tahun, pelangganId));
            System.out.println("Mobil berhasil ditambahkan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
