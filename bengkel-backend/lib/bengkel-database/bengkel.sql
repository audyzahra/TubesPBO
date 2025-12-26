-- ================================
-- DATABASE BENGKEL MOBIL
-- ================================

CREATE DATABASE IF NOT EXISTS bengkel_db;
USE bengkel_db;

-- ================================
-- TABEL USER
-- ================================
CREATE TABLE IF NOT EXISTS user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(100),
    role ENUM('ADMIN','MEKANIK','KASIR')
);

-- ================================
-- TABEL PELANGGAN
-- ================================
CREATE TABLE IF NOT EXISTS pelanggan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100),
    no_hp VARCHAR(20),
    alamat TEXT
);

-- ================================
-- TABEL MOBIL
-- ================================
CREATE TABLE IF NOT EXISTS mobil (
    id INT AUTO_INCREMENT PRIMARY KEY,
    no_plat VARCHAR(20),
    merk VARCHAR(50),
    tipe VARCHAR(50),
    tahun INT,
    pelanggan_id INT,
    FOREIGN KEY (pelanggan_id) REFERENCES pelanggan(id)
);

-- ================================
-- TABEL SERVIS
-- ================================
CREATE TABLE IF NOT EXISTS servis (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mobil_id INT,
    keluhan TEXT,
    status ENUM('MENUNGGU','DIKERJAKAN','SELESAI'),
    biaya INT,
    FOREIGN KEY (mobil_id) REFERENCES mobil(id)
);
