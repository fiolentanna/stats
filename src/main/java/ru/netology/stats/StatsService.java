package ru.netology.stats;

// Сумма всех продаж
public class StatsService {
    public int sumOfSales(int[] sales) {
        int sum = 0;
        for (int monthSales : sales) {
            sum += monthSales;
        }
        return sum;
    }

//  Средняя сумма продаж в месяц
    public double averageSales(int[] sales) {
        int sum = this.sumOfSales(sales);
        return (double) sum / sales.length;
    }

// Номер месяца, в котором был минимум продаж
    public int monthOfMinSales(int[] sales) {
        int month = 0;
        int min = sales[0];
        int minMonth = 1;
        for (int monthSales : sales) {
            month++;
            if (min >= monthSales) {
                min = monthSales;
                minMonth = month;
            }
        }

        return minMonth;
    }

// Номер месяца, в котором был пик продаж
    public int monthOfMaxSales(int[] sales) {
        int month= 0;
        int max = sales[0];
        int maxMonth = 1;
        for (int monthSales : sales) {
            month++;
            if (max<= monthSales) {
                max = monthSales;
                maxMonth = month;
            }
        }

        return maxMonth;
    }

// Кол-во месяцев, в которых продажи были ниже среднего
    public int lessThanAverage(int[] sales) {
        int quantityOfMonths = 0;
        double average = this.averageSales(sales);

        for (int sale : sales) {
            if ((double) sale < average) {
                quantityOfMonths++;
            }
        }

        return quantityOfMonths;
    }

// Кол-во месяцев, в которых продажи были выше среднего
    public int moreThanAverage(int[] sales) {
        int quantityOfMonths = 0;
        double average = this.averageSales(sales);

        for (int sale : sales) {
            if ((double) sale > average) {
                quantityOfMonths++;
            }
        }

        return quantityOfMonths;
    }

}

