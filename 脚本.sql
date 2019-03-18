--创建数据dev
CREATE DATABASE dev;

--切换到数据库dev
USE dev;

--查看当前正在使用的数据库
select DATABASE();

--查看当前库中存在哪些表
show tables;

--创建Student表
create table student(
  id int not null auto_increment,
  name varchar(120),
  age int(11),
  PRIMARY key(id)
);

create table course(
  id int not null auto_increment,
  name varchar(120),
  code varchar(20),
  PRIMARY key(id)
)

--查询表
SELECT * from student;

--往表中插入记录
insert into student(name, age) values('gaoweigang', '22');

insert into course(name, code) values('语文', 'yuwen');