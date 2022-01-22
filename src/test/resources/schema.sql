CREATE TABLE producto(
    id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    numero_de_serie DECIMAL(20,0) NOT NULL,
    marca VARCHAR(45),
    cantidad BIGINT
);


