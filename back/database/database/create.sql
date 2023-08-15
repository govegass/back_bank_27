-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-05-08 10:25:23.294

-- tables
-- Table: role
CREATE TABLE role (
    id serial  NOT NULL,
    name varchar(50)  NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
    id serial  NOT NULL,
    role_id int  NOT NULL,
    username varchar(255)  NOT NULL,
    password varchar(255)  NOT NULL,
    status char(1)  NOT NULL,
    CONSTRAINT user_ak_1 UNIQUE (username) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

CREATE TABLE city
(
    id   serial       NOT NULL,
    name varchar(255) NOT NULL,
    CONSTRAINT city_ak_1 UNIQUE (name) NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT city_pk PRIMARY KEY (id)
);

-- Reference: user_role (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_role
    FOREIGN KEY (role_id)
    REFERENCES role (id)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- End of file.

