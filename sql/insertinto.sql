INSERT INTO users VALUES
    ('jon','jonathan chow',1111,50,0),
    ('jiemi','jie mi chong',1111,50,0),
    ('lindy','lindy lim',1111,50,0),
    ('john','john low',2222,50,0),
    ('adam','adam ang',2222,50,0),
    ('pius','pius lee',3333,50,0),
    ('luke','luke brown',3333,50,0);

INSERT INTO friends VALUES
    ('jon','jiemi'),
    ('jiemi','lindy'),
    ('lindy','jon'),
    ('john','adam'),
    ('john','lindy'),
    ('john','jiemi'),
    ('john','jon'),
    ('jon','adam'),
    ('adam','lindy'),
    ('adam','jiemi'),
    ('pius','jiemi'),
    ('lindy','pius'),
    ('pius','john'),
    ('pius ','adam'),
    ('luke','john');

select * from friend_requests;
insert into friend_requests values ('luke', 'lindy');
INSERT INTO friend_requests VALUES
    ('lindy','pius'),
    ('lindy','jon'),
    ('lindy','jiemi'),
    ('john','jon'),
    ('jon','pius'),
    ('pius','adam'),
    ('luke','pius'),
    ('jiemi','luke'),
    ('jiemi','jon');

INSERT INTO posts VALUES
    (1,'jon','jon','hello I''m jon!','2020-01-01 13:01:52'),
    (2,'jon','jiemi','i love coding','2020-01-01 13:01:52'),
    (3,'pius','pius','c is cool','2020-01-01 13:01:52'),
    (4,'adam','jiemi','Let''s meet up for lunch!','2020-01-01 13:01:52'),
    (5,'john','pius','hahahha','2020-01-01 13:01:52'),
    (6,'adam','jon','hello it''s me','2020-01-01 13:01:52'),
    (7,'jiemi','lindy','nope','2020-01-01 13:01:52');

INSERT INTO lands VALUES
    (1,'jon','Papaya','2020-02-01 13:01:52'),
    (2,'jon','Pumpkin','2020-01-01 13:01:52'),
    (3,'jon','Papaya','2020-01-01 13:01:52'),
    (4,'jon','Sunflower','2020-01-01 13:01:52'),
    (5,'jon','Watermelon','2020-01-01 13:01:52'),
    (6,'jiemi','Papaya','2020-01-01 13:01:52'),
    (7,'jiemi','Sunflower','2020-01-01 13:01:52'),
    (8,'jiemi','Papaya','2020-01-01 13:01:52'),
    (9,'jiemi','Watermelon','2020-01-01 13:01:52'),
    (10,'jiemi','Papaya','2020-01-01 13:01:52'),
    (11,'lindy','Papaya','2020-01-01 13:01:52'),
    (12,'lindy','Sunflower','2020-01-01 13:01:52'),
    (13,'lindy','Papaya','2020-01-01 13:01:52'),
    (14,'lindy','Watermelon','2020-01-01 13:01:52'),
    (15,'lindy','Papaya','2020-01-01 13:01:52'),
    (16,'adam','Pumpkin','2020-01-01 13:01:52'),
    (17,'pius','Sunflower','2020-01-01 13:01:52'),
    (18,'john','Watermelon','2020-01-01 13:01:52');
    
-- INSERT INTO lands VALUES 
-- 	(19,'luke','\N','\N');

INSERT INTO likes VALUES
    ('john',1,0),
    ('lindy',1,0),
    ('jiemi',1,1),
    ('adam',2,1),
    ('jon',3,1),
    ('jiemi',4,1),
    ('jiemi',1,0),
    ('pius',4,0),
    ('lindy',4,1),
    ('lindy',4,0);

INSERT INTO seeds VALUES
    ('jon','Sunflower',2),
    ('jon','Papaya',3),
    ('adam','Pumpkin',2),
    ('pius','Watermelon',1),
    ('lindy','Sunflower',2);

INSERT INTO gifts VALUES
    (1,'jon','jiemi','Papaya',0,'2020-01-01 13:01:52'),
    (2,'lindy','jon','Pumpkin',0,'2020-01-01 13:01:52'),
    (3,'adam','jon','Pumpkin',0,'2020-01-01 13:01:52'),
    (4,'pius','jon','Pumpkin',0,'2020-01-01 13:01:52'),
    (5,'luke','jon','Pumpkin',0,'2020-01-01 13:01:52'),
    (6,'lindy','jon','Pumpkin',1,'2020-01-01 13:01:52'),
    (7,'adam','lindy','Pumpkin',1,'2020-01-01 13:01:52'),
    (8,'lindy','adam','Sunflower',0,'2020-01-01 13:01:52'),
    (9,'lindy','pius','Sunflower',1,'2020-01-01 13:01:52'),
    (10,'lindy','luke','Sunflower',1,'2020-01-01 13:01:52'),
    (11,'jiemi','pius','Sunflower',1,'2020-01-01 13:01:52'),
    (12,'pius','jiemi','Sunflower',0,'2020-01-01 13:01:52');

INSERT INTO replies VALUES
    (1,1,'lindy','bye jon','2020-01-01 13:01:52'),
    (2,1,'pius','hi jon','2020-01-01 13:01:52'),
    (3,2,'pius','me too','2020-01-01 13:01:52'),
    (4,3,'jon','reply','2020-01-01 13:01:52'),
    (5,4,'adam','not a reply','2020-01-01 13:01:52'),
    (6,5,'luke','test','2020-01-01 13:01:52'),
    (7,6,'jiemi','heheh','2020-01-01 13:01:52'),
    (8,7,'luke','nope','2020-01-01 13:01:52');

