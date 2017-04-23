# --- !Ups

create table test_entity (
  id                            bigint not null auto_increment,
  user_name                     varchar(255),
  constraint pk_test_entity primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into test_entity (user_name) values('test user');

# --- !Downs

drop table if exists test_entity;
drop sequence if exists test_entity_seq;

