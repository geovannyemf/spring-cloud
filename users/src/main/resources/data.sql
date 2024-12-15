INSERT INTO user (username, password, email, enable) VALUES 
('user1', 'password1', 'user1@example.com', true),
('user2', 'password2', 'user2@example.com', true),
('user3', 'password3', 'user3@example.com', true),
('user4', 'password4', 'user4@example.com', true),
('user5', 'password5', 'user5@example.com', true),
('user6', 'password6', 'user6@example.com', true),
('user7', 'password7', 'user7@example.com', true),
('user8', 'password8', 'user8@example.com', true),
('user9', 'password9', 'user9@example.com', true),
('user10', 'password10', 'user10@example.com', true);

INSERT INTO role (name) VALUES("ROLE_USER");
INSERT INTO role (name) VALUES("ROLE_ADMIN");


INSERT INTO users_roles (user_id, role_id) VALUES(1,1);
INSERT INTO users_roles (user_id, role_id) VALUES(2,1);
INSERT INTO users_roles (user_id, role_id) VALUES(3,1);
INSERT INTO users_roles (user_id, role_id) VALUES(4,1);
INSERT INTO users_roles (user_id, role_id) VALUES(5,1);
INSERT INTO users_roles (user_id, role_id) VALUES(6,1);
INSERT INTO users_roles (user_id, role_id) VALUES(7,1);
INSERT INTO users_roles (user_id, role_id) VALUES(8,1);
INSERT INTO users_roles (user_id, role_id) VALUES(9,2);