--SET search_path TO boot;

CREATE TABLE items  (id serial, title varchar(100));

INSERT INTO items (title) VALUES ('Bread'), ('Milk'), ('Box'), ('Bread1'), ('Milk1'), ('Box1');