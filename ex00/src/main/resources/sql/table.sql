create table USER_INFO (
	user_id varchar(50) not null,
	user_pw varchar(50) not null,
	user_name varchar(50) not null,
	user_email varchar(100),
	created_at timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_at timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	primary key(user_id)
);

select * from USER_INFO;