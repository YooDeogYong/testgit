create table t97_qna
	( no number(5) Primary Key, 
	title varchar2(200) not null,
	content varchar2(4000) not null,
	name varchar2(30) not null,
	reg_date date default sysdate,
	group_no varchar2(5)not null,
	read_Count number(5) default 0,
	id varchar2(5) not null
	);

create sequence qna_no;

