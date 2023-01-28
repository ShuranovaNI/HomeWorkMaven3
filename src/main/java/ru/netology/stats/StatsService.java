package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthNumber = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                monthNumber = i;
                maxSale = sales[i];
            }
        }
        return monthNumber + 1;
    }
    public int monthMinSale(long[] sales) {
        int monthNumber = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                monthNumber = i;
                minSale = sales[i];
            }
        }
        return monthNumber + 1;
    }

    public int calcMonthSalesBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthSalesAboveAverage(long[] sales) {
        long averegeSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averegeSale) {
                counter++;
            }
        }
        return counter;
    }
}
