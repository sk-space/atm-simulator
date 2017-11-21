-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2017 at 11:31 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atm_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `accountType` varchar(100) NOT NULL,
  `accountNo` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `totalBalance` int(100) NOT NULL,
  `loan` int(100) DEFAULT NULL,
  `uid` int(100) DEFAULT NULL,
  `user` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `accountType`, `accountNo`, `username`, `password`, `totalBalance`, `loan`, `uid`, `user`) VALUES
(1, 'General', '123456A', 'first', 'first', 1500, 15000, NULL, 1),
(2, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(3, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(4, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(5, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(6, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(7, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(8, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(9, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(10, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(11, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(12, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(13, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(14, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(15, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(16, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(17, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(18, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(19, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(20, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(21, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(22, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(23, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(24, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(25, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(26, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(27, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(28, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(29, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(30, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(31, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(32, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(33, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(34, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(35, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(36, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(37, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(38, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(39, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(40, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(41, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(42, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(43, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(44, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(45, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(46, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(47, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(48, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(49, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(50, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(51, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(52, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(53, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(54, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(55, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(56, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(57, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(58, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(59, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(60, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14),
(61, 'General', '123456A', 'user', 'pass', 15000, NULL, NULL, 14),
(62, 'General', '123456', 'user', 'pass', 15000, NULL, NULL, 14),
(63, 'General', '123456XXL', 'user', 'pass', 15000, NULL, NULL, 14);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fName` varchar(50) NOT NULL,
  `mName` varchar(50) NOT NULL,
  `lName` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  `citizenship` varchar(50) NOT NULL,
  `account` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `fName`, `mName`, `lName`, `gender`, `address`, `citizenship`, `account`) VALUES
(1, 'First', 'Middle', 'Last', 'Male', 'Address', '123456', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
