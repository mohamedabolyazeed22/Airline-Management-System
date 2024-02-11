CREATE DATABASE AirlLineManagement; 
USE AirlLineManagement; 

CREATE TABLE Login (
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
	
INSERT INTO Login (username, password) 
VALUES ('Mohamed', '123');

SELECT  username, password
FROM Login;


CREATE TABLE manageflight (
    flighcode VARCHAR(50) PRIMARY KEY,
    source VARCHAR(100),
    destination VARCHAR(100),
    takeoff VARCHAR(100),
    noofseat INT
);

CREATE TABLE ticketbooking (
     passenger_id INT AUTO_INCREMENT PRIMARY KEY,
     passenger_number INT ,
	 passenger_name VARCHAR(255),
     flight_code VARCHAR(10),
     nationality  VARCHAR(50),
     gender varchar(8),
     amount int
  
);

CREATE TABLE managepassenger (
    passenger_name VARCHAR(255),
    passport_Number INT AUTO_INCREMENT PRIMARY KEY,
    nationality  VARCHAR(50),
    phone varchar(20),
    gender varchar(8)
  
);


INSERT INTO manageflight (flighcode, source, destination, takeoff, noofseat)
VALUES ('FL123', 'Egypt', 'Cairo', '2024-01-28 08:00:00', 200);

SELECT flighcode, source, destination, takeoff, noofseat
FROM manageflight;

drop DATABASE AirlLineManagement; 