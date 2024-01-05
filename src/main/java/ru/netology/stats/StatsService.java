package ru.netology.stats;

public class StatsService {

    public int totalSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + (int) sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int totalSales = totalSales(sales);
        double average = totalSales / sales.length;
        return (int) average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowTheAverage(long[] sales) {
        int average = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        int average = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}