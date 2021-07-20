-- 
--crear Base de datos y ejecutar la estructura de la tabla 
--
DROP TABLE IF EXISTS `tb_persona`;
CREATE TABLE `tb_persona` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

LOCK TABLES `tb_persona` WRITE;
INSERT INTO `tb_persona` VALUES (2,'joan','lemus',0),(3,'natalia','munoz',0);
UNLOCK TABLES;

 