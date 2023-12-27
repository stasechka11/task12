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

}