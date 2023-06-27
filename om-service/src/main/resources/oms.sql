create database oms1;

create database oms2;

CREATE TABLE torder_1 (
	order_id BIGINT(20) PRIMARY KEY,
	status varchar(20) NOT NULL,
	gmt_create datetime NOT NULL,
	sku_code VARCHAR(50) NOT NULL,
	sku_name VARCHAR(50) NOT NULL,
	price DECIMAL(10, 2) NOT NULL,
	buyer_id BIGINT(20) NOT NULL
);

CREATE TABLE torder_2 (
	order_id BIGINT(20) PRIMARY KEY,
	status varchar(20) NOT NULL,
	gmt_create datetime NOT NULL,
	sku_code VARCHAR(50) NOT NULL,
	sku_name VARCHAR(50) NOT NULL,
	price DECIMAL(10, 2) NOT NULL,
	buyer_id BIGINT(20) NOT NULL
);

use  oms2;