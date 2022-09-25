show tables;

create table Personajes(
idPerso  int,
name     varchar(255),
poder    varchar(100),
arma     varchar(255),
city     varchar(100)

)

alter table personajes  add primary key (idPerso);

ALTER TABLE primeraep.personajes MODIFY COLUMN idPerso int auto_increment NOT NULL;


select * from personajes

insert into personajes (name,poder,arma ,city)
values('Zhongli','Geo','Lanza', 'Liyue');

insert into personajes (name,poder,arma ,city)
values('Xiao','Anemo','Lanza', 'Liyue');

insert into personajes (name,poder,arma ,city)
values('Albedo','Geo','Espada', 'Monstad');

--- --- --- --- -- ---   -----

create procedure TodosPers()
begin
	select * from personajes;
end

call TodosPers();