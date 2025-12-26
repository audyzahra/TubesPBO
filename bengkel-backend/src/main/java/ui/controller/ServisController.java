package ui.controller;

import backend.model.Mobil;
import backend.service.MobilService;

public class ServisController {

    public void prosesServis(Mobil mobil) {
        try {
            MobilService service = new MobilService();
            service.tambahMobil(mobil);
            System.out.println("Servis diproses (contoh)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
