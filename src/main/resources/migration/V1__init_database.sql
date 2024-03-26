-- db/migration/V1__create_customer_and_account_tables.sql

CREATE TABLE customers (
                           id SERIAL PRIMARY KEY,
                           uuid VARCHAR(255) UNIQUE NOT NULL,
                           name VARCHAR(255),
                           gender VARCHAR(255)
);

CREATE TABLE account (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255),
                         email VARCHAR(255),
                         password VARCHAR(255),
                         customer_id INTEGER NOT NULL,
                         FOREIGN KEY (customer_id) REFERENCES customers(id)
);

