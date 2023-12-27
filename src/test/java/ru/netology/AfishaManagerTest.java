package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AfishaManagerTest {
    @Test
    public void shouldFindAllMovies() {
        AfishaManager afishaManager = new AfishaManager();

        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
        Movie movie3 = new Movie(3, "Отель Белград", "Комедия");

        afishaManager.addMovie(movie1);
        afishaManager.addMovie(movie2);
        afishaManager.addMovie(movie3);

        Movie[] expected = {movie1, movie2, movie3};
        Movie[] actual = afishaManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenLimitLessThanSize() {
        AfishaManager afishaManager = new AfishaManager();

        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
        Movie movie3 = new Movie(3, "Отель Белград", "Комедия");
        Movie movie4 = new Movie(4, "Джентельмены", "Боевик");
        Movie movie5 = new Movie(5, "Человек-невидимка", "Ужасы");
        Movie movie6 = new Movie(6, "Тролли", "Мультфильм");

        afishaManager.addMovie(movie1);
        afishaManager.addMovie(movie2);
        afishaManager.addMovie(movie3);
        afishaManager.addMovie(movie4);
        afishaManager.addMovie(movie5);
        afishaManager.addMovie(movie6);

        Movie[] expected = {movie6, movie5, movie4, movie3, movie2};
        Movie[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}