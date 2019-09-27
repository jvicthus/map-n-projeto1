-- DDL

-- criar tabela

/*

 create table <nome_tabela>(
	<nome_coluna> <tipo> <restricao>,
	... 
 )

 */
 
create table clientes(
	codigo serial primary key,
	nome text not null,
	email text
) 

-- remover uma tabela

-- drop table <nome_tabela>
drop table clientes;
drop table produtos


-- acrescentar coluna

alter table clientes add column idade integer;

-- DML

-- inserir registro

/* 
	insert into <tabela>
	(col1, col2, col3)
	values
	(valor1, valor2, valor3)
*/

insert into clientes (nome, email)
values ('Allyson', 'allyson@gmail.com');
insert into clientes (nome, email)
values ('Maria', 'maria@gmail.com');
insert into clientes (nome, email)
values ('Aldo', 'aldo@gmail.com');
insert into clientes (nome, email)
values ('Fabiana', 'fabiana@gmail.com');

-- remover registro

delete from clientes where codigo = 1;

-- atualizar registro

update clientes 
set nome = 'Allyson Jeronimo', email = 'allysonjeronimo@gmail.com'
where codigo = 5

update clientes set idade = 20 where nome = 'Maria';
update clientes set idade = 30 where nome = 'Allyson Jeronimo';

update clientes set idade = 17 where nome = 'Fabiana';

update clientes set idade = 53 where nome = 'Aldo';

-- consultar registros

select * from clientes;

select * from clientes where codigo = 5 

select * from clientes where codigo = 4 or codigo = 7

select * from clientes where nome = 'Maria'

-- consultar todos os clientes ordenados pelo nome
select * from clientes order by nome desc;

select nome from clientes where codigo > 5 order by nome desc

-- funções de agregação min(), max(), avg(), sum(), count

-- soma de todas as idades dos clientes
select sum(idade) from clientes

select max(idade) from clientes

select min(idade) from clientes

select avg(idade) from clientes

select * from clientes limit 2

select * from clientes order by idade desc limit 1

-- quantidade de registros
select count(*) from clientes;


