CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table test (
    id uuid primary key not null default uuid_generate_v4(),
    name text not null,
    fio text not null);