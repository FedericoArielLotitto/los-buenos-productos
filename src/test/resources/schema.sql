CREATE TABLE producto(
    id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    numero_de_serie VARCHAR(20) NOT NULL,
    marca VARCHAR(45),
    cantidad BIGINT
);


