CREATE SCHEMA `Products` DEFAULT CHARACTER SET utf8 ;

USE Products;

CREATE TABLE `tbProducts` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `description` VARCHAR(45) NOT NULL,
    `quantity` INT NOT NULL,
    `price` DOUBLE NOT NULL,
    PRIMARY KEY (`id`));
)
