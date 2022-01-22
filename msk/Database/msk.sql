DROP DATABASE msk;
DROP TABLE accounts;
CREATE DATABASE msk;
CREATE TABLE accounts (
    user_id serial PRIMARY KEY ,
    email VARCHAR (50) UNIQUE NOT NULL,
    password VARCHAR (50) NOT NULL ,
    first_name VARCHAR (30) NOT NULL,
    last_name VARCHAR (30) NOT NULL,
    gender VARCHAR (10) NOT NULL,
    date_of_birth VARCHAR (10) NOT NULL

);
SELECT * FROM accounts;