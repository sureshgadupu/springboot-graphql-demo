--select * from department;

INSERT INTO DEPARTMENT(id,name) VALUES(100,'HR');
INSERT INTO DEPARTMENT(id,name) VALUES(101,'PDE');
INSERT INTO DEPARTMENT(id,name) VALUES(102,'Marketing');




INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Alex','Bonilla','M','1990-12-07','2011-04-01',100);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Duke','Stacey','M','1989-07-11','2012-08-21',100);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Hayley','Drake','M','1992-10-01','2007-07-06',101);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Nancie','Beasley','M','1978-02-21','2003-03-03',101);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Wyatt','Holder','M','1994-12-01','2016-02-15',101);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Tobey','Drake','M','1992-10-01','2014-06-11',102);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Marvin','Hope','M','1978-02-21','2003-09-10',102);
INSERT INTO EMPLOYEE(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(nextval('hibernate_sequence'),'Ibrar','Garcia','M','1994-12-01','2004-12-21',102);

commit;

select * from department;

