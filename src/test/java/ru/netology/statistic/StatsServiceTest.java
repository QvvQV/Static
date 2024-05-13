package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void sumSales(){
        StatsService service= new StatsService();

        //данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180; //контрольное значение

        //вызываем метод
        long actual =service.sumSales(sale);

        //сравниваем ожидаемый и фактический результаты

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void averageSumSales(){
        StatsService service = new StatsService();

        long[] sale = {1, 1, 2, 3, 5, 8, 13, 21, 31, 15, 10};
        long expected = 10;

        long actual = service.averageSumSales(sale);

        //сравниваем ожидаемый и фактический результаты

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticMonthUnderAverage(){
        StatsService service = new StatsService();

        long[] sale = {3, 10, 5, 8, 2, 13, 7, 15, 28, 9, 11, 4};
        long expected = 6;

        long actual = service.statisticMonthUnderAverage(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticMonthOverAverage(){
        StatsService service = new StatsService();

        long[] sale = {3, 10, 5, 8, 2, 13, 7, 15, 28, 9, 11, 4};
        long expected = 5;

        long actual = service.statisticMonthOverAverage(sale);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void minSales(){
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales(){
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sale);

        Assertions.assertEquals(expected, actual);
    }
}
