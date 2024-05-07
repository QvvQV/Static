package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void sumSales(){
        StatsService service= new StatsService();

        //данные
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180; //контрольное значение

        //вызываем метод
        int actual =service.sumSales(sale);

        //сравниваем ожидаемый и фактический результаты

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void averageSumSales(){
        StatsService service = new StatsService();

        int[] sale = {1, 1, 2, 3, 5, 8, 13, 21, 31, 15, 10};
        double expected = 10;

        double actual = service.averageSumSales(sale);

        //сравниваем ожидаемый и фактический результаты

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticMonthUnderAverage(){
        StatsService service = new StatsService();

        int[] sale = {3, 10, 5, 8, 2, 13, 7, 15, 28, 9, 11, 4};
        int expected = 6;

        int actual = service.statisticMonthUnderAverage(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticMonthOverAverage(){
        StatsService service = new StatsService();

        int[] sale = {3, 10, 5, 8, 2, 13, 7, 15, 28, 9, 11, 4};
        int expected = 5;

        int actual = service.statisticMonthOverAverage(sale);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void minSales(){
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales(){
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sale);

        Assertions.assertEquals(expected, actual);
    }
}
