use master
go

DROP DATABASE IF EXISTS DBCovid;

create database DBCovid
go

use DBCovid
go
if OBJECT_ID('TPersonalMedico','U') is not null
	drop table  TPersonalMedico
go
create table TPersonalMedico
(
    IdPersonal int NOT NULL,
    Username varchar(20) NOT NULL,
    Contraseña varchar(20) NOT NULL,
    Cargo varchar(200) NOT NULL,
    Nombre varchar(200) NOT NULL,
    Apellido varchar(200) NOT NULL,
    DNI varchar(8) NOT NULL,
	primary key(IdPersonal)
)  
go

if OBJECT_ID('TPaciente','U') is not null
	drop table  TPaciente
go
create table TPaciente
(
    IdPaciente int primary key,
    Nombre varchar(200) NOT NULL,
    Apellido varchar(200) NOT NULL,
    DNI varchar(8) NOT NULL,
    Celular varchar(9) NOT NULL,
    Email varchar(200) NOT NULL,
    Sexo varchar(1) NOT NULL, -- F: Femenino ; M:Masculino
    FechaNac date NOT NULL,
	Peso float not null,
	Altura float not null,
    Nacionalidad varchar(200) not null,
	Distrito varchar(200) not null
)  
go




if OBJECT_ID('THistorial','U') is not null
	drop table  THistorial
go
create table THistorial
(
    IdHistorial int primary key,
    Fecha_Historial date NOT NULL,
	Sintomas text not null,
	IdPaciente int NOT NULL,
	IdPersonal int not null,
	foreign key (IdPaciente) references TPaciente,
	foreign key (IdPersonal) references TPersonalMedico,
)  
go



if OBJECT_ID('TPrueba','U') is not null
	drop table  TPrueba
go
create table TPrueba
(
    IdPrueba int NOT NULL,
    Costo varchar(20) NOT NULL,
    Resultado varchar(15) NOT NULL,
    Tipo varchar(100) NOT NULL,
    Fecha_Prueba date NOT NULL,
    Periodica varchar(2) NULL,
	IdHistorial int,
    primary key (IdPrueba),
	foreign key (IdHistorial) references THistorial
)  
go



if OBJECT_ID('TTratamiento','U') is not null
	drop table  TTratamiento
go
create table TTratamiento
(
    IdTratamiento int NOT NULL,
    Desc_Riesgo text NOT NULL,
    Desc_Medicamentos text NOT NULL,
    Desc_Tratamiento text NOT NULL,
	IdHistorial int not null,
    primary key (IdTratamiento),
	foreign key (IdHistorial) references THistorial
)  
go


if OBJECT_ID('TSeguimiento','U') is not null
	drop table  TSeguimiento
go
create table TSeguimiento
(
    NroSeguimiento int NOT NULL,
    Nuevos_Sintomas text NOT NULL,
    Gravedad varchar(200) NOT NULL,
	Fecha_Seguimiento date not null,
	IdHistorial int not null,
    primary key (NroSeguimiento),
	foreign key (IdHistorial) references THistorial
)  
go