create database user_db;

use user_db;
create table users (id int primary key auto_increment,
name varchar(30) not null,
email varchar(30) unique not null,
password varchar (30) not null);

insert into users (name,email,password) values ("aarthi","aarthi@gmail.com","12345");
insert into users (name,email,password) values ("anjana","anjana@gmail.com","abcde");
insert into users (name,email,password) values ("balaji","balaji@gmail.com","abc123");
insert into users (name,email,password) values ("mala","mala@gmail.com","abc123");

select id,name,email,password from users;

create table book (bid int primary key auto_increment,
bname varchar(30) not null,
bprice int not null);

insert into book(bname,bprice) values ("java7",300);
insert into book(bname,bprice) values ("harry_potter",200);
insert into book(bname,bprice) values ("twilight",100);
insert into book(bname,bprice) values ("jingle_bells",50);
insert into book(bname,bprice) values ("lights",500);
insert into book(bname,bprice) values ("locket",220);

select bid,bname,bprice from book;

desc users;

