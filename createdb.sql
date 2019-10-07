CREATE TABLE IF NOT EXISTS type(
	id int(10) unsigned NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS category(
	id int(10) unsigned NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
    typeId int(10) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS item(
	id int(10) unsigned NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS item_category(
	categoryId int(10) unsigned NOT NULL,
    itemId int(10) NOT NULL,
    PRIMARY KEY (categoryId)
);

INSERT INTO type(name) VALUES
	("Type1"),
	("Type2"),
	("Type3"),
	("Type4");

INSERT INTO category(name, typeId) VALUES
	("Cate1", 1),
	("Cate2", 1),
	("Cate3", 1),
	("Cate4", 2),
	("Cate5", 3),
	("Care6", 4),
	("Cate7", 4),
	("Cate8", 2),
	("Cate9", 2);

INSERT INTO item(name) VALUES
	("Item1"),
	("Item2"),
	("Item3"),
	("Item4"),
	("Item5");

INSERT INTO item_category(categoryId, itemId) VALUES
	(1, 1),
	(2, 1),
	(3, 2),
	(4, 2),
	(5, 3),
	(6, 4),
	(7, 5),
	(8, 3),
	(9, 2);

