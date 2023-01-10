-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2023 at 06:45 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fuel_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `fuel_management`
--

CREATE TABLE `fuel_management` (
  `vehicle_number_plate` varchar(255) NOT NULL,
  `fuel_type` varchar(255) DEFAULT NULL,
  `vehicle_type` varchar(255) DEFAULT NULL,
  `fuel_amount` decimal(10,2) DEFAULT NULL,
  `payment_amount` decimal(10,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `dispenser_id` int(11) DEFAULT NULL,
  `income` decimal(10,2) NOT NULL,
  `remaining_stock` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fuel_management`
--

INSERT INTO `fuel_management` (`vehicle_number_plate`, `fuel_type`, `vehicle_type`, `fuel_amount`, `payment_amount`, `date`, `time`, `dispenser_id`, `income`, `remaining_stock`) VALUES
('ABC123', 'Petrol', 'Car', '10.00', '4500.00', '2022-01-01', '09:00:00', 1, '35.50', '100.00'),
('ABC456', 'Petrol', 'Three wheel', '7.00', '3150.00', '2022-01-01', '14:00:00', 3, '30.00', '80.00'),
('DBF489', 'Diesel', 'Motor Bike', '10.00', '4300.00', '2022-01-01', '14:30:00', 4, '48.50', '85.00'),
('DEF789', 'Petrol', 'Three wheel', '5.00', '2250.00', '2022-01-01', '10:00:00', 3, '30.00', '80.00'),
('GHI012', 'Diesel', 'Motor Bike', '8.00', '3440.00', '2022-01-01', '10:30:00', 4, '48.50', '85.00'),
('JKL345', 'Petrol', 'Car', '12.00', '5400.00', '2022-01-01', '11:00:00', 1, '35.50', '100.00'),
('MNO678', 'Diesel', 'Van', '20.00', '8600.00', '2022-01-01', '11:30:00', 2, '40.00', '90.00'),
('PQR901', 'Petrol', 'Three wheel', '6.00', '2700.00', '2022-01-01', '12:00:00', 3, '30.00', '80.00'),
('STU234', 'Diesel', 'Motor Bike', '9.00', '3870.00', '2022-01-01', '12:30:00', 4, '48.50', '85.00'),
('VWX567', 'Petrol', 'Car', '11.00', '4950.00', '2022-01-01', '13:00:00', 1, '35.50', '100.00'),
('XYZ456', 'Diesel', 'Van', '15.00', '6450.00', '2022-01-01', '09:30:00', 2, '40.00', '90.00'),
('YZ0123', 'Diesel', 'Van', '18.00', '7740.00', '2022-01-01', '13:30:00', 2, '40.00', '90.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fuel_management`
--
ALTER TABLE `fuel_management`
  ADD PRIMARY KEY (`vehicle_number_plate`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
