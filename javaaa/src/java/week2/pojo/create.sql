CREATE TABLE products (
                          product_id serial,
                          product_name varchar(255),
                          product_price integer
);

CREATE TABLE clients (
                         client_id serial,
                         client_name varchar(255)
);

CREATE TABLE purchases (
                           order_id serial,
                           purchases_products varchar(255)
);