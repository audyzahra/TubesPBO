package ui.controller;

import backend.dao.PelangganDAO;
import backend.model.Pelanggan;

public class PelangganController {

    public void tambahPelanggan(String nama, String hp, String alamat) {
        try {
            PelangganDAO dao = new PelangganDAO();
            dao.insert(new Pelanggan(0, nama, hp, alamat));
            System.out.println("Pelanggan berhasil ditambahkan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
