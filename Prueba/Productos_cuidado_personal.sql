-- Crear base de datos
CREATE DATABASE productos_cp;
USE productos_cp;

-- Crear tabla USUARIO
CREATE TABLE USUARIO (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

select * from USUARIO;

-- Insertar registros en la tabla USUARIO
INSERT INTO USUARIO (username, password) VALUES ('Freddy', 'Freddy123');
INSERT INTO USUARIO (username, password) VALUES ('Pablo', 'Pablo123');
INSERT INTO USUARIO (username, password) VALUES ('David', 'David123');

-- Crear tabla PRODUCTO
CREATE TABLE PRODUCTO (
    codigo_producto VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    cantidad INT NOT NULL,
    categoria VARCHAR(50)
);

select * from PRODUCTO;
-- Insertar registros en la tabla PRODUCTO
INSERT INTO PRODUCTO (codigo_producto, nombre, descripcion, precio, cantidad, categoria)
VALUES ('CP001', 'Crema facial anti-edad', 'Crema facial hidratante y antiarrugas, 50ml', 29.99, 50, 'Cuidado Facial');

INSERT INTO PRODUCTO (codigo_producto, nombre, descripcion, precio, cantidad, categoria)
VALUES ('CP002', 'Shampoo reparador', 'Shampoo fortificante para cabello dañado, 300ml', 12.50, 80, 'Cuidado Capilar');

INSERT INTO PRODUCTO (codigo_producto, nombre, descripcion, precio, cantidad, categoria)
VALUES ('CP003', 'Jabón líquido de manos', 'Jabón antibacterial con aloe vera, 250ml', 8.99, 100, 'Higiene Personal');
