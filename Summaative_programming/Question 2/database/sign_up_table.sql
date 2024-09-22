-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Apr 27, 2022 at 11:58 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sign_up_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `sign_up_table`
--

CREATE TABLE `sign_up_table` (
  `firstname` varchar(1000) NOT NULL,
  `lastname` varchar(1000) NOT NULL,
  `username` varchar(1000) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sign_up_table`
--

INSERT INTO `sign_up_table` (`firstname`, `lastname`, `username`, `password`) VALUES
('kalisa', 'patrick', 'kalisapatrick@gmail.com', '1234'),
('desire', 'nkumbuyinka', 'n.desire@alustudent.com', '1234'),
('uwase', 'germaine', 'u.ger@alu.com', '1234'),
('arfat', 'eric', 'a.eric@alustudent.com', '123456789'),
('Nkumbuyinka', 'Desire', 'n.desire@alustudent.com', '1234'),
('cadeaux', 'ndanyuzwe', 'cadaux@alustudent.com', '4321'),
('kalisa', 'claude', 'kc@kepler.org', '123456789'),
('manzi', 'samuel', 'm.sam@havardun.com', '1256');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
