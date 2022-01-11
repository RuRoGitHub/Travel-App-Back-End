DROP TABLE IF EXISTS `destination` CASCADE;

CREATE TABLE `destination` (
	`id` INTEGER PRIMARY KEY AUTO_INCREMENT,
	`city_Name`  VARCHAR(255) NOT NULL,
	`country_Name` VARCHAR(255) NOT NULL,
	`best_Time_to_Vist` VARCHAR(255) NOT NULL,
	`recommended_Places_to_Visit` VARCHAR(255) NOT NULL, 
 	`conversion_Rate_(£)` DECIMAL
 );