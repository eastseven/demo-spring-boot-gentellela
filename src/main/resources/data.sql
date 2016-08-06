INSERT INTO t_users(username,email,password,enabled) VALUES ('priya','abc@abc.com','$2a$04$CO93CT2ObgMiSnMAWwoBkeFObJlMYi/wzzOnPlsTP44r7qVq0Jln2', true);
INSERT INTO t_users(username,email,password,enabled) VALUES ('naveen','def@def.com','$2a$04$j3JpPUp6CTAe.kMWmdRNC.Wie58xDNPfcYz0DBJxWkucJ6ekJuiJm', true);

INSERT INTO t_user_roles (user_id, role) VALUES (001, 'ROLE_USER');
INSERT INTO t_user_roles (user_id, role) VALUES (002, 'ROLE_ADMIN');
INSERT INTO t_user_roles (user_id, role) VALUES (002, 'ROLE_USER');
