DROP TABLE IF EXISTS `destination` CASCADE;

CREATE TABLE `destination` (
	`idDestination` INTEGER PRIMARY KEY AUTO_INCREMENT,
	`City_Name`  VARCHAR(255) NOT NULL,
	`Country_Name` VARCHAR(255) NOT NULL,
	`Best_Time_of_Year_to_Visit` VARCHAR(255) NOT NULL,
	`Places_to_Visit` VARCHAR(255) NOT NULL, 
 	`Conversion_Rate_(£)` DECIMAL NOT NULL,
);