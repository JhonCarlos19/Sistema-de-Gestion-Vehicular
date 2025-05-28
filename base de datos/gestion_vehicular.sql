-- Crear base de datos
CREATE DATABASE bd_gestion_vehicular;
USE bd_gestion_vehicular;

-- 1. Tabla de usuarios 
CREATE TABLE tb_usuario (
    idUsuario INT(11) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    usuario VARCHAR(15) NOT NULL,
    password VARCHAR(15) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    estado INT(1) NOT NULL
);
insert into tb_usuario(nombre,apellido,usuario,password,telefono,estado)
values ("Jhon","Troya","jhon","123456","0999999999",1);

select usuario, password from tb_usuario where usuario = "jhon"  and password  = "123456";

select *from tb_categoria_vehiculo;
select descripcion tb_categoria_vehiculo idCategoriaVehiculo descripcion  from tb_categoria_vehiculo where descripcion = '';
truncate table tb_categoria_vehiculo;

-- 2. Tabla de categoría de vehículo 
CREATE TABLE tb_categoria_vehiculo (
    idCategoriaVehiculo INT(11) AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL,
    estado INT(1) NOT NULL
);
ALTER TABLE tb_categoria_vehiculo
CHANGE idCategoriaVehiculo idCategoria INT(11) AUTO_INCREMENT PRIMARY KEY;

DROP TABLE tb_categoria_vehiculo;

-- 3. Tabla de vehículos 
CREATE TABLE tb_vehiculo (
    idVehiculo INT(11) AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(10) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    marca VARCHAR(30) NOT NULL,
    color VARCHAR(30) NOT NULL,
    anio INT(4) NOT NULL,
    idCategoriaVehiculo INT(11) NOT NULL,
    observacion VARCHAR(100),
    estado INT(1) NOT NULL,
    FOREIGN KEY (idCategoriaVehiculo) REFERENCES tb_categoria_vehiculo(idCategoriaVehiculo)
);

-- 4. Tabla de técnicos 
CREATE TABLE tb_tecnico (
    idTecnico INT(11) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    ci VARCHAR(20) NOT NULL,
    especialidad VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    correo VARCHAR(50),
    estado INT(1) NOT NULL
);

-- 5. Cabecera de mantenimiento 
CREATE TABLE tb_cabecera_mantenimiento (
    idCabeceraMantenimiento INT(11) AUTO_INCREMENT PRIMARY KEY,
    idVehiculo INT(11) NOT NULL,
    idTecnico INT(11) NOT NULL,
    fecha DATE NOT NULL,
    total DOUBLE(10,2) NOT NULL,
    observaciones VARCHAR(200),
    estado INT(1) NOT NULL,
    FOREIGN KEY (idVehiculo) REFERENCES tb_vehiculo(idVehiculo) ON DELETE RESTRICT,
    FOREIGN KEY (idTecnico) REFERENCES tb_tecnico(idTecnico) ON DELETE RESTRICT
);

-- 6. Detalle de mantenimiento 
CREATE TABLE tb_detalle_mantenimiento (
    idDetalleMantenimiento INT(11) AUTO_INCREMENT PRIMARY KEY,
    idCabeceraMantenimiento INT(11) NOT NULL,
    descripcionTrabajo VARCHAR(200) NOT NULL,
    costo DOUBLE(10,2) NOT NULL,
    repuestoUtilizado VARCHAR(100),
    tiempoInvertido VARCHAR(50),
    estado INT(1) NOT NULL,
    FOREIGN KEY (idCabeceraMantenimiento) REFERENCES tb_cabecera_mantenimiento(idCabeceraMantenimiento)
);
show tables;


