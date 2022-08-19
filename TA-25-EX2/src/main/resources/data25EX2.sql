DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;

CREATE TABLE Departamentos (
Codigo int primary key auto_increment,
Nombre nvarchar (100),
Presupuesto int
);

CREATE TABLE Empleados (
DNI varchar(8) primary key not null,
Nombre nvarchar(100),
Apellidos nvarchar (255),
CONSTRAINT FK1 FOREIGN KEY (Departamento) REFERENCES Departamentos(Codigo)
);

INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Financiero', 10.000);
INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Marketing', 20.000);
INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Comercial', 5.000);
INSERT INTO Departamentos (Nombre, Presupuesto) VALUES ('Dep.Logistica', 15.000);

INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('19675898','Carlos', 'Garcia');
INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('12345678','Maria', 'Zaplana');
INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('87654321','Juan', 'Rogriguez');
INSERT INTO Empleados (DNI, Nombre, Apellidos) VALUES ('00112233','Sara', 'Marin');