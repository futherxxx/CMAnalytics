# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table commitment_area (
  id                        bigint auto_increment not null,
  commitment_area_name      varchar(255),
  constraint pk_commitment_area primary key (id))
;

create table country (
  id                        bigint auto_increment not null,
  country_name              varchar(255),
  constraint pk_country primary key (id))
;

create table person (
  id                        bigint auto_increment not null,
  title                     varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  gender                    varchar(255),
  mobile                    varchar(255),
  whats_app_id              varchar(255),
  email                     varchar(255),
  postal_address            varchar(255),
  nationality               varchar(255),
  state                     varchar(255),
  local_church              varchar(255),
  chapter_member            varchar(255),
  commitments               varchar(255),
  constraint pk_person primary key (id))
;

create table registered_user (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  password                  varchar(255),
  constraint pk_registered_user primary key (id))
;

create table state (
  id                        bigint auto_increment not null,
  state_name                varchar(255),
  constraint pk_state primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table commitment_area;

drop table country;

drop table person;

drop table registered_user;

drop table state;

SET FOREIGN_KEY_CHECKS=1;

