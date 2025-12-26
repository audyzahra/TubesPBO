package backend.service;

import backend.dao.MobilDAO;
import backend.model.Mobil;

public class MobilService {
    private MobilDAO dao = new MobilDAO();

    public void tambahMobil(Mobil m) throws Exception {
        dao.insert(m);
    }
}
