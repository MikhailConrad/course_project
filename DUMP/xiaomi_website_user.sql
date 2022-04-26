-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: xiaomi_website
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(16) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `lastname` varchar(64) NOT NULL,
  `firstname` varchar(64) NOT NULL,
  `email` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (8,'root','$2a$10$dfn4llpEH/VgzCtWthG3fO57mEOCGAs1TBa813xqPr.iuebKw7juu','Root','Admin','none'),(9,'winnerfly','$2a$10$Utrt5Thl5ujFzpWVjbNKCOu0hW7k/zBFbPEIvucxS8VpWdQWf1hby','Kalyagin','Mikhail','mikhail@gmail.com'),(10,'alexey','$2a$10$arGpNNiux2zrk496bYNI.uY5rDLbN5rp0t9dOaDitGUMQpe0hi11.','Иванов','Алексей','alexey@mail.ru'),(11,'testUser','$2a$10$jv/vNSJYfkbOrOn/6fCD4eJC6nOG81Kia6fF0nE2wjNgKRRevEtwK','User','Testing','test@mail.ru'),(12,'scasi','$2a$10$27mG2DHUKczZkOgNmkewYev3eg3jQpuZ78oH21lmqAf.HiAhoijQ2','Сидоров','Иван','ivan@mail.ru'),(13,'sergey','$2a$10$CIX55UeZPl6v.6Ict0JhQOmRSmzeggN.By4Uo4M5dZvogpJZCLoTu','Петров','Сергей','sergey@mail.ru'),(14,'root3','$2a$10$b8cYzNDHy33gEyMUG5WkyOkAt3UUXCOnsWJoioAFye77TlIFlpk2a','adm','Admin','root3@gmail.com'),(15,'root5','$2a$10$UnYiMaQD/dZw5XmDpiRwjO3KiP4H7WGR/d6YDY8ztM24hlARCOWxm','Admin','Admin','root5@mail.ru');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-11 21:06:30
