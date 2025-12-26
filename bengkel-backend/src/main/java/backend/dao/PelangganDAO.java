package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import backend.config.DatabaseConnection;
import backend.model.Pelanggan;

public class PelangganDAO {

    public void insert(Pelanggan p) throws Exception {
        String sql = "INSERT INTO pelanggan(nama,no_hp,alamat) VALUES (?,?,?)";
        Connection c = DatabaseConnection.getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, p.getNama());
        ps.setString(2, p.getNoHp());
        ps.setString(3, p.getAlamat());
        ps.executeUpdate();
    }

    public ResultSet getAll() throws Exception {
        String sql = "SELECT * FROM pelanggan";
        return DatabaseConnection.getConnection()
                .createStatement()
                .executeQuery(sql);
    }
}
