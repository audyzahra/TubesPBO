package main.java.backend;

import main.java.backend.config.DatabaseConnection;

public class MainTest {
    public static void main(String[] args) {
        try {
            DatabaseConnection.getConnection();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi gagal");
        }
    }
}