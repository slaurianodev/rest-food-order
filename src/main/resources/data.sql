DELETE FROM Cousine;
DELETE FROM Store;
DELETE FROM Product;

INSERT INTO Cousine (name) VALUES ('Chinese');
INSERT INTO Cousine (name) VALUES ('Pizza');
INSERT INTO Cousine (name) VALUES ('Vietnamese');
INSERT INTO Cousine (name) VALUES ('Sushi');

INSERT INTO Store (name,address,cousine_id) values ('Hai Shang','2991 Pembina Hwy, Winnipeg, Manitoba R3T 2H5, Canada',1);;
INSERT INTO Store (name,address,cousine_id) values ('Santa Lucia Pizza Winnipeg','4 St Mary''s Rd, Winnipeg, Manitoba R2H 1H1, Canada',2);
INSERT INTO Store (name,address,cousine_id) values ('Pho Kim Tuong','856 Ellice Ave, Winnipeg, Manitoba R3G 0C4, Canada',3);
INSERT INTO Store (name,address,cousine_id) values ('Wasabi Sabi','Taylor Avenue, Winnipeg, Manitoba, Canada',4);

INSERT INTO Product (store_id,name,description,price) values (1,'Shrimp Tempura','Fresh shrimp battered and deep fried until golden brown',10.95);
INSERT INTO Product (store_id,name,description,price) values (2,'Pizza and Wings Special','One twelve-inch medium pizza with two toppings and twelve chicken wings',16.99);
INSERT INTO Product (store_id,name,description,price) values (3,'Shrimp with Snow Peas and Cashew','A delicious combination of fresh shrimp, snow peas, and cashew',12.50);
INSERT INTO Product (store_id,name,description,price) values (4,'Assorted Sashimi','Fresh assorted sashimi, hand-picked and thinly sliced by the chef',20);
