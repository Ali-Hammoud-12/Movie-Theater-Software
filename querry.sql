DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS beverages;
DROP TABLE IF EXISTS PurchaseMovie;
DROP TABLE IF EXISTS PurchaseBEV;



CREATE TABLE customer (
    Name Varchar (30) PRIMARY KEY,
    Password Varchar (30)
);

CREATE TABLE movie (
    Name varchar (30) PRIMARY KEY,
    Price double,
    TotalNumberofTickets integer
    );

create TABLE Beverages (
    
    Name Varchar (30) PRIMARY KEY,
    Price Double,
    TotalQuantity integer
    
    );

CREATE TABLE PurchaseMovie (
    
    customerName varchar (30) REFERENCES customer (Name)
    on update cascade
    on delete cascade,
    MovieName Varchar (30) REFERENCES movie (Name)
    on update cascade
    on delete cascade,
    NbofTickets integer,
    date Date
);


CREATE TABLE PurchaseBEV (
    
    customerName varchar (30) REFERENCES customer (Name) 
    on update cascade
    on delete cascade,
     BeverageName Varchar (30) REFERENCES beverage (Name)
    on update cascade
    on delete cascade,
    Quantity integer,
    date Date
);

INSERT INTO customer(name, password) VALUES('Ali', 01815767);
INSERT INTO customer(name, password) VALUES('Kevin', 33532);


INSERT INTO movie  VALUES('SpiderMan' , 15 ,100);
INSERT INTO movie  VALUES('Matrix' , 20 , 150);
INSERT INTO movie  VALUES('IronMan' , 12 , 1000);
INSERT INTO movie  VALUES('PlayerOne', 15 , 135);
INSERT INTO movie  VALUES('CaptinMarvel' , 15 , 1504);


INSERT INTO Beverages VALUES('Pepsi' , 7 , 1500);
INSERT INTO Beverages VALUES('7UP' , 7 , 1500);
INSERT INTO Beverages VALUES('Sprite' , 5 , 1000);
INSERT INTO Beverages VALUES('Salt Popcorn' , 15 , 2500);
INSERT INTO Beverages VALUES('Cheese Popcorn' , 15 , 4500);
INSERT INTO Beverages VALUES('Carmel Popcorn' , 15 , 3500);
INSERT INTO Beverages VALUES('Nachos' , 12 , 2250);

