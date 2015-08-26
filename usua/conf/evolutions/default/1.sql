# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  id_user                   bigint auto_increment not null,
  nome                      varchar(255),
  constraint pk_usuario primary key (id_user))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

