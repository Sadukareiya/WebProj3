drop database if exists testdb;
create database testdb;
use testdb;

create table users (
  user_id int primary key auto_increment,
  user_name varchar(255),
  password varchar(255)
);

insert into users (user_id, user_name, password) values
  (1, 'taro', '123'),
  (2, 'jiro', '456'),
  (3, 'hanako', '789');

create table inquiry (
  name varchar(255),
  qtype varchar(255),
  body varchar(255)
);
