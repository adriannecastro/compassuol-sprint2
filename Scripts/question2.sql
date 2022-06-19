CREATE SCHEMA `Movies`;

USE Movies;

CREATE TABLE `tbMovies` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(150) NOT NULL,
    `description` VARCHAR(150) NOT NULL,
    `year` INT NOT NULL,
    PRIMARY KEY (`id`));

INSERT INTO movie(name, description, year) VALUES ('The Godfather', 'Drama', 1972);
INSERT INTO movie(name, description, year) VALUES ('The Assistant', 'Drama', 2019);
INSERT INTO movie(name, description, year) VALUES ('Raging Bull', 'Biography', 1980);
INSERT INTO movie(name, description, year) VALUES ('Forrest Gump', 'Drama, Romance', 1994);
INSERT INTO movie(name, description, year) VALUES ('The Lorde of the Rings: The Return of the King', 'Action, Adventure', 2003);
INSERT INTO movie(name, description, year) VALUES ('Inception', 'Sci-Fi, Action', 2010);
INSERT INTO movie(name, description, year) VALUES ('Fight Club', 'Drama', 1999);
INSERT INTO movie(name, description, year) VALUES ('Matrix', 'Action, Sci-Fi', 1999);
INSERT INTO movie(name, description, year) VALUES ('Top Gun: Maverick', 'Action, Drama', 2022);
INSERT INTO movie(name, description, year) VALUES ('Interstellar', 'Adventure, Sci-Fi', 2014);
INSERT INTO movie(name, description, year) VALUES ('City of God', 'Crime, Drama', 2002);
INSERT INTO movie(name, description, year) VALUES ('Star Wars', 'Adventure, Fantasy', 1977);
INSERT INTO movie(name, description, year) VALUES ('Parasite', 'Comedy, Drama, Thriller', 2019);
INSERT INTO movie(name, description, year) VALUES ('Whiplash', 'Drama, Music', 2014);
INSERT INTO movie(name, description, year) VALUES ('Psicose', 'Horror, Mystery', 1960);
INSERT INTO movie(name, description, year) VALUES ('Fast & Furious', 'Action', 2001);
INSERT INTO movie(name, description, year) VALUES ('Gladiator', 'Action, Adventure', 2000);
INSERT INTO movie(name, description, year) VALUES ('Avengers: Endgame', 'Action, Sci-Fi', 2019);
INSERT INTO movie(name, description, year) VALUES ('Spider-Man: No Way Home', 'Action, Adventure', 2021);
INSERT INTO movie(name, description, year) VALUES ('Need for Speed', 'Action, Drama', 2014);