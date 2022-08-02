create sequence hibernate_sequence start 1 increment 1;
create table test (id int4 not null, fio varchar(255), name varchar(255), primary key (id));