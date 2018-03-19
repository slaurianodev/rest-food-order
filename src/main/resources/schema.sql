CREATE TABLE IF NOT EXISTS `Customer`(
	`id` bigint(20) NOT NULL auto_increment,
	`email` varchar(200) NOT NULL,
	`name` varchar(200) NOT NULL,
	`address` varchar (200) NOT NULL,
	`creation` datetime NOT NULL,
	`password` varchar(200) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `Cousine`(
	`id` bigint(20) NOT NULL auto_increment,
	`name` varchar(200) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `Store`(
	`id` bigint(20) NOT NULL auto_increment,
	`name` varchar(200) NOT NULL,
	`address` varchar(200) NOT NULL,
	`cousine_id` bigint(20) NOT NULL,
	PRIMARY KEY (`id`),
	CONSTRAINT FK_STORE_COUSINE FOREIGN KEY (`cousine_id`) REFERENCES `Cousine`(`id`)
);

CREATE TABLE IF NOT EXISTS `Product`(
	`id` bigint(20) NOT NULL auto_increment,
	`store_id` bigint(20) NOT NULL,
	`name` varchar(200) NOT NULL,
	`description` varchar(200) NOT NULL,
	`price` double NOT NULL,
	PRIMARY KEY (`id`),
	CONSTRAINT FK_PRODUCT_STORE FOREIGN KEY (`store_id`) REFERENCES `Store`(`id`)
);

CREATE TABLE IF NOT EXISTS `Order_Customer`(
	`id` bigint(20) NOT NULL auto_increment,
	`date` datetime NOT NULL,
	`customer_id` bigint(20) NOT NULL,
	`delivery_address` varchar(200) NOT NULL,
	`contact` varchar(200) NOT NULL,
	`store_id` bigint(20) NOT NULL,
	`last_update` datetime NOT NULL,
	`status` varchar(200) NOT NULL,
	`total` double NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `Order_Item`(
	`id` bigint(20) NOT NULL auto_increment,
	`order_id` bigint(20) NOT NULL,
	`product_id` bigint(20) NOT NULL,
	`price` double NOT NULL,
	`quantity` bigint(20) NOT NULL,
	`total` double NOT NULL,
	PRIMARY KEY (`id`),
	CONSTRAINT FK_ORDER_ITEM_PRODUCT FOREIGN KEY (`product_id`) REFERENCES `Product`(`id`),
	CONSTRAINT FK_ORDER_ITEM_ORDER FOREIGN KEY (`order_id`) REFERENCES `Order_Customer`(`id`)
);

