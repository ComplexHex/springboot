ALTER TABLE items
ADD cost INT;


UPDATE items SET cost = 20
WHERE id = 1;
UPDATE items SET cost = 30
WHERE id = 2;

UPDATE items SET cost = CASE
WHEN id = 3 THEN 55
WHEN id = 4 THEN 36
WHEN id = 5 THEN 24
WHEN id = 6 THEN 46
WHEN id = 7 THEN 46
WHEN id = 8 THEN 46
WHEN id = 9 THEN 46
END

WHERE id IN (3, 4, 5, 6, 7, 8, 9);
