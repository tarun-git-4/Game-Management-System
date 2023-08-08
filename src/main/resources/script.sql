CREATE DATABASE  IF NOT EXISTS `game_directory`;
USE `game_directory`;

# DROP TABLE IF EXISTS `employee`;

CREATE TABLE `games` (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `game_name` varchar(45) DEFAULT NULL,
                         `release_year` varchar(45) DEFAULT NULL,
                         `rating` varchar(45) DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `student` VALUES
                          (1,'Counter Strike: 1.6',1999,9.6),
                          (2,'Elden Ring',2022,7.9);

