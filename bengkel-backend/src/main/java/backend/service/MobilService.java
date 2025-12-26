package main.java.backend.service;

import main.java.backend.dao.MobilDAO;
import main.java.backend.model.Mobil;

public class MobilService {
    private MobilDAO dao = new MobilDAO();

    public void tambahMobil(Mobil m) throws Exception {
        dao.insert(m);
    }
}
