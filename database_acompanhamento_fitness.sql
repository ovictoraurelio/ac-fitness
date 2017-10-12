-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15-Jan-2015 às 01:06
-- Versão do servidor: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ac_fitness`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atividade`
--

CREATE TABLE IF NOT EXISTS `atividade` (
`sequencial` int(11) NOT NULL,
  `str_titulo` varchar(30) COLLATE utf8_bin NOT NULL,
  `str_descricao` varchar(240) COLLATE utf8_bin NOT NULL,
  `val_classificacao` double NOT NULL,
  `tim_tempoMinimio` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `atividade_exercicio`
--

CREATE TABLE IF NOT EXISTS `atividade_exercicio` (
  `cod_atividade` int(11) NOT NULL,
  `cod_exercicio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dado_clinico`
--

CREATE TABLE IF NOT EXISTS `dado_clinico` (
  `cod_trainer` int(11) NOT NULL,
  `dth_insercao` int(11) NOT NULL,
  `val_peso` int(11) NOT NULL,
  `val_altura` int(11) NOT NULL,
  `val_cintura` int(11) NOT NULL,
  `val_abdomen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `exercicio`
--

CREATE TABLE IF NOT EXISTS `exercicio` (
`sequencial` int(11) NOT NULL,
  `str_titulo` varchar(30) COLLATE utf8_bin NOT NULL,
  `str_descricao` varchar(240) COLLATE utf8_bin NOT NULL,
  `val_percaCalorica` int(11) NOT NULL,
  `val_tempoMedio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `refeicao`
--

CREATE TABLE IF NOT EXISTS `refeicao` (
`sequencial` int(11) NOT NULL,
  `str_titulo` varchar(30) COLLATE utf8_bin NOT NULL,
  `str_descricao` varchar(240) COLLATE utf8_bin NOT NULL,
  `val_nutricional` int(11) NOT NULL,
  `val_calorico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `registro_atividade`
--

CREATE TABLE IF NOT EXISTS `registro_atividade` (
  `cod_atividade` int(11) NOT NULL,
  `cod_trainer` int(11) NOT NULL,
  `val_avaliacaoDesempenho` double NOT NULL,
  `val_desgasto` double NOT NULL,
  `hor_inicio` time NOT NULL,
  `hor_fim` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `registro_refeicao`
--

CREATE TABLE IF NOT EXISTS `registro_refeicao` (
  `cod_refeicao` int(11) NOT NULL,
  `cod_trainer` int(11) NOT NULL,
  `dth_refeicao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `trainer`
--

CREATE TABLE IF NOT EXISTS `trainer` (
`sequencial` int(11) NOT NULL,
  `cpf` varchar(11) COLLATE utf8_bin NOT NULL,
  `str_nome` varchar(60) COLLATE utf8_bin NOT NULL,
  `dat_nascimento` date NOT NULL,
  `chr_sexo` char(1) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atividade`
--
ALTER TABLE `atividade`
 ADD PRIMARY KEY (`sequencial`);

--
-- Indexes for table `exercicio`
--
ALTER TABLE `exercicio`
 ADD PRIMARY KEY (`sequencial`);

--
-- Indexes for table `refeicao`
--
ALTER TABLE `refeicao`
 ADD PRIMARY KEY (`sequencial`);

--
-- Indexes for table `trainer`
--
ALTER TABLE `trainer`
 ADD PRIMARY KEY (`sequencial`), ADD UNIQUE KEY `cpf` (`cpf`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `atividade`
--
ALTER TABLE `atividade`
MODIFY `sequencial` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `exercicio`
--
ALTER TABLE `exercicio`
MODIFY `sequencial` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `refeicao`
--
ALTER TABLE `refeicao`
MODIFY `sequencial` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `trainer`
--
ALTER TABLE `trainer`
MODIFY `sequencial` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
