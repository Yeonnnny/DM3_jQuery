-- 고객 정보 처리를 위한 DB 객체 정의

drop table customer;
drop sequence customer_seq;

create table customer(
    customer_num number primary key,
    username varchar2(30),
    email varchar2(30)
);

create sequence customer_seq;

select * from customer;