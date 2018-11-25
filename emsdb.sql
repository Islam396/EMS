-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 04, 2017 at 09:53 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `emsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE IF NOT EXISTS `employee_details` (
  `emp_id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `country` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `contactNo` varchar(20) NOT NULL,
  `emailId` varchar(20) NOT NULL,
  `hiredate` varchar(54) NOT NULL,
  `employeeType` varchar(20) NOT NULL,
  `Login_id` int(11) NOT NULL,
  `campanydesignation` varchar(50) NOT NULL,
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`emp_id`, `username`, `name`, `address`, `country`, `state`, `city`, `contactNo`, `emailId`, `hiredate`, `employeeType`, `Login_id`, `campanydesignation`) VALUES
(3, 'amin', 'dsg', 'sfg, Dinajpur', 'dsg', 'jk Sadar', 'uklkl', '+88gh', 'frr', '20/10/2016', 'bal', 69, 'Developer'),
(11, 'rk', 'Rajesh Kumar Das', 'bASHERHAT', 'Bangladesh', 'Dinajpur city', 'Dinajpur, Rajshahi', '+8801746477122', 'das2429@gmail.com', '19/11/2013', 'TL', 67, 'Developer'),
(12, 'avi69', 'bicchu', 'khgsdf', 'ja[am', 'khgk', 'sdas', 'asdasd', 'sad', 'asd', 'knock', 64, 'kjgsv'),
(33, 'sdfsdf222', '', '', '', '', '', '', '', '', 'dsfsd', 23, ''),
(55, 'fdgn', 'jdbfg', 'r8yt', '', '', '', '', '', '', 'fd', 5, ''),
(66, 'dsfds343', '', '', '', '', '', '', '', '', 'fdsf', 444, ''),
(90, 'jhfdg', '', '', '', '', '', '', '', '', 'irrur', 77, ''),
(666, 'juju', '', '', '', '', '', '', '', '', 'ghh', 55, ''),
(1000, 'ruby123', 'Rocky', 'Konabari', 'Bangladesh', 'Dhaka', 'Gazipur', '+8801716833323', 'rocky@gmail.com', '10/10/2010', 'Senior Executive', 193, 'Engineer');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `Login_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(54) NOT NULL,
  `password` varchar(54) DEFAULT NULL,
  `usertype` varchar(54) DEFAULT NULL,
  PRIMARY KEY (`Login_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Login_id`, `username`, `password`, `usertype`) VALUES
(1, 'amin', '123', 'admin'),
(2, 'f', 'u', 'k'),
(3, 'juju', 'ghg', 'ghh'),
(4, 'ruby123', '1010', 'Senior Executive'),
(5, 'fdgn', '4545', 'fd');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
