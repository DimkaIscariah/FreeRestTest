package ru.netology.services.FreeRest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FreeRestTest {
    @Test
    void shouldCalculateForLowIncome() {
        FreeRest service = new FreeRest();

        int expected = 3; // ожидаемый результат

        // входящие данные
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        long actual = service.calculate(income, expenses, threshold); //вызов целевого метода

        Assertions.assertEquals(expected, actual); //производим проверку (сравнение ожидаемого и фактического результата)


    }

    @Test
    void shouldCalculateForHighIncome() {
        FreeRest service = new FreeRest();

        int expected = 2; // ожидаемый результат

        //входящие данные
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        long actual = service.calculate(income, expenses, threshold); // вызов целевого метода

        Assertions.assertEquals(expected, actual);
    }
}
