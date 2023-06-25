-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table a112113437.barang
CREATE TABLE IF NOT EXISTS `barang` (
  `kode_barang` char(10) NOT NULL,
  `nama_barang` varchar(15) DEFAULT NULL,
  `satuan` char(5) DEFAULT NULL,
  `jumlah` int(5) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL,
  PRIMARY KEY (`kode_barang`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table a112113437.barang: ~5 rows (approximately)
INSERT INTO `barang` (`kode_barang`, `nama_barang`, `satuan`, `jumlah`, `harga`) VALUES
	('brg001', 'Lemari Kaca', 'unit', 10, 1500000),
	('brg002', 'Komputer', 'unit', 5, 5000000),
	('brg003', 'Minyak Goreng', 'kilo', 12, 120000),
	('brg004', 'Gula Pasir', 'kilo', 5, 65000),
	('brg005', 'Telur', 'kilo', 6, 29000);

-- Dumping structure for table a112113437.pelanggan
CREATE TABLE IF NOT EXISTS `pelanggan` (
  `kode_pelanggan` varchar(50) NOT NULL,
  `nama_pelanggan` varchar(50) NOT NULL,
  `alamat_pelanggan` varchar(50) NOT NULL,
  `kota_pelanggan` varchar(50) NOT NULL,
  PRIMARY KEY (`kode_pelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table a112113437.pelanggan: ~2 rows (approximately)
INSERT INTO `pelanggan` (`kode_pelanggan`, `nama_pelanggan`, `alamat_pelanggan`, `kota_pelanggan`) VALUES
	('pel0001', 'Budi Santoso', 'Jl. Kenanga', 'Pati'),
	('pel0003', 'Budi Santoso', 'Jl. Kenanga', 'Pati');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
