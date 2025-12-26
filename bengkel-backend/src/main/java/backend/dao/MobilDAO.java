package main.java.backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import main.java.backend.config.DatabaseConnection;
import main.java.backend.model.Mobil;

public class MobilDAO {

    public void insert(Mobil m) throws Exception {
        String sql = "INSERT INTO mobil(no_plat,merk,tipe,tahun,pelanggan_id) VALUES (?,?,?,?,?)";
        Connection c = DatabaseConnection.getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, m.getNoPlat());
        ps.setString(2, m.getMerk());
        ps.setString(3, m.getTipe());
        ps.setInt(4, m.getTahun());
        ps.setInt(5, m.getPelangganId());
        ps.executeUpdate();
    }
}
