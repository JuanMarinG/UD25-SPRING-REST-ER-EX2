DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;

CREATE TABLE Departamentos (
Id int primary key auto_increment,
Nombre varchar (100),
Presupuesto int
);

CREATE TABLE Empleados (
DNI varchar(8) primary key,
Nombre varchar(100),
Apellidos varchar (255),
Departamento int,
FOREIGN KEY (Departamento) REFERENCES Departamentos(Id)
);

INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Financiero', 10.000);
INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Marketing', 20.000);
INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Comercial', 5.000);
INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Logistica', 15.000);

INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('19675898','Carlos', 'Garcia');
INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('12345678','Maria', 'Zaplana');
INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('87654321','Juan', 'Rogriguez');
INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('00112233','Sara', 'Marin');