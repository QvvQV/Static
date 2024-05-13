package ru.netology.statistic;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; //месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

//номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { //значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; //месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

//сумму всех продаж
    public long sumSales(long[] sale) {
        long sum = 0;

        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

//средняя сумма в месяц
    public long averageSumSales(long[] sale) {
        long numberSale = sale.length;
        long sum = sumSales(sale); //вызов метода для вычисления суммы продаж
        long averageMonth = sum / numberSale;
        return averageMonth;
    }

//количество месяцев, в которых продажи были ниже среднего
    public int statisticMonthUnderAverage(long[] sale) {
        long averageSum = averageSumSales(sale);
        int numberUnderAverage = 0; //Запускаем цикл от 0 до длины массива sale

        for (int i = 0; i < sale.length; i++) { // если значение из массива меньше среднего, то увеличиваем счётчик numberUnderAverage на 1
            if (sale[i] < averageSum) {
                numberUnderAverage = numberUnderAverage + 1;
            }
        }
        return numberUnderAverage;
    }

//количество месяцев, в которых продажи были выше среднего
    public int statisticMonthOverAverage(long[] sale) {
        long averageSum = averageSumSales(sale);
        int numberOverAverage = 0; //Запускаем цикл от 0 до длины массива sale

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1; // если значение из массива выше среднего, то увеличиваем счётчик numberUnderAverage на 1
            }
        }
        return numberOverAverage;
    }
}

