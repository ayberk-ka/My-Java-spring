DROP database msk;
CREATE TABLE accounts (
    user_id serial PRIMARY KEY ,
    user_name VARCHAR (30) NOT NULL ,
    password VARCHAR (50) NOT NULL ,
    email VARCHAR (50) UNIQUE NOT NULL
);
SELECT * FROM accounts;