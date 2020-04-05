SELECT users.username AS username, users.name AS name, users.password AS password
FROM friends
INNER JOIN users
ON (friends.u1 = users.username OR friends.u2 = users.username)
WHERE (friends.u1='jon' OR friends.u2='jon') AND username!='jon';

UPDATE lands
SET crop='Pumpkin',startTime='2011-11-08'
WHERE lid = 3;

SELECT *
FROM users INNER JOIN gifts
ON (users.username=gifts.gifter OR users.username=gifts.giftee)
WHERE gifts.giftee='jon';

UPDATE users
SET gold=100, xp=100
WHERE username='jon';

SELECT *
FROM seeds
WHERE username='jon' AND crop='Papaya';

UPDATE seeds
SET quantity=10
WHERE username='jon' AND crop='Papaya';

INSERT INTO seeds
VALUES ('jon', 'Pumpkin', 1);

INSERT INTO gifts (gifter, giftee, crop, accepted, dt)
VALUES ('jon', 'jiemi', 'Papaya', 0, '2011-11-08');

INSERT INTO lands (username, crop, startTime) VALUES ('jon', NULL, '2020-01-01 13:01:52');