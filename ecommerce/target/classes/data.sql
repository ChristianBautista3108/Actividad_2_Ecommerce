/*INSERT INTO producto (id, descripcion, precio) VALUES (1, 'Pistola Hidrogel', 100.0);
INSERT INTO producto (id, descripcion, precio) VALUES (2, 'Combo X8', 200.0);
INSERT INTO producto (id, descripcion, precio) VALUES (3, 'Plancha de Pelo', 300.0);
*/

/*INSERT INTO producto (id, descripcion, precio) VALUES (1, 'Test Product', 100);*/

CREATE TABLE IF NOT EXISTS producto (
                                        id INT PRIMARY KEY,
                                        descripcion VARCHAR(255),
    precio DECIMAL(10, 2)
    );

INSERT INTO producto (id, descripcion, precio) VALUES (1, 'Combo X8', 100);
