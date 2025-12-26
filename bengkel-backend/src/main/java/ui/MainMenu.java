package ui;

import ui.controller.PelangganController;
import ui.controller.DashboardController;

public class MainMenu {

    public static void main(String[] args) {
        System.out.println("MainMenu jalan");

        // TEST 2-TIER
        PelangganController pc = new PelangganController();
        pc.tambahPelanggan("Budi", "08123", "Bandung");

        // TEST 3-TIER
        DashboardController dc = new DashboardController();
        dc.loadDashboard();
    }
}
