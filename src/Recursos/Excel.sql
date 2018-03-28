DROP DATABASE excel;


CREATE DATABASE excel;

USE excel;

CREATE TABLE clientes(
id INT AUTO_INCREMENT,
alias VARCHAR(30),
apellido VARCHAR(30),
nombre VARCHAR(30),
direccion VARCHAR(30),
poblacion VARCHAR(30),
telefono VARCHAR(9),
movil VARCHAR(9),
email VARCHAR(30),
observacion VARCHAR(50),
sexo VARCHAR(11),
fecha_nacimiento DATE,
estado_civil VARCHAR(30),
desempleado BOOLEAN,
fumador BOOLEAN,
PRIMARY KEY(id)
);

CREATE TABLE proveedores(
id_proveedor INT(11),
nombre_proveedor VARCHAR (30),
direccion VARCHAR (50),
telefono VARCHAR (30),
fax VARCHAR (30),
rfc VARCHAR (30),
correo VARCHAR (30),
web VARCHAR (30),
contacto VARCHAR (30),
puesto_contacto VARCHAR (30),
telefono_contacto VARCHAR (30),
movil_contacto VARCHAR (30),
correo_contacto VARCHAR (30),
telefono_alterno1 VARCHAR (30),
telefono_alterno2 VARCHAR (30),
cantidades_compradas VARCHAR (30),
cantidades_pesos INT,
PRIMARY KEY (id_proveedor)
);

CREATE TABLE productos(
id_producto INT(11),
nombre_producto VARCHAR (30),
id_proveedor INT(11),
categoria VARCHAR (30),
cantidad_por_unidad VARCHAR (30),
precio_unidad INT,
unidades_existencia INT,
unidades_en_pedido INT,
nivel_nuevo_pedido INT,
suspendido BOOLEAN,
PRIMARY KEY (id_producto),
FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE ventas(
numeroVenta  INT AUTO_INCREMENT,
fechaVenta DATE,
horaVenta TIME,
valorVenta INT(11),
cliente INT(11),
PRIMARY KEY (numeroVenta),
FOREIGN KEY (cliente) REFERENCES clientes(id)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE pedidos(
numeroPedido  INT AUTO_INCREMENT,
fechaPedido DATE,
horaPedido TIME,
valorPedido INT,
PRIMARY KEY (numeroPedido)
);

CREATE TABLE detallePedidos(
idDetallePedido  INT AUTO_INCREMENT,
id_producto INT,
id_pedido INT,
PRIMARY KEY (idDetallePedido),
FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
ON DELETE CASCADE
ON UPDATE CASCADE,
FOREIGN KEY (id_pedido) REFERENCES pedidos(numeroPedido)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE detalleVentas(
idDetalleVentas INT AUTO_INCREMENT ,
id_producto INT(11),
id_venta INT,
cantidad INT(11),
PRIMARY KEY (idDetalleVentas),
FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
ON DELETE CASCADE
ON UPDATE CASCADE,
FOREIGN KEY (id_venta) REFERENCES ventas(numeroVenta)
ON DELETE CASCADE
ON UPDATE CASCADE
);

/**

LOAD DATA LOCAL INFILE 'C:\\Users\\HP\\Documents\\Office\\Clientes.csv' INTO TABLE clientes FIELDS TERMINATED BY ';' IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'C:\Users\HP\Documents\Office\Clientes.csv' INTO TABLE clientes FIELDS TERMINATED BY ';'  IGNORE 1 LINES
