package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageNumber(long[] sales){
        long totalSale = sum(sales);
        long averageNumber = totalSale / 12;
        return  averageNumber;
    }

    public int peakMaximumSales(long[] sales){
        int peakMaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] >= sales[peakMaxMonth]) {
                peakMaxMonth = i;
            }
        }
        return peakMaxMonth + 1;
    }

    public int peakMinimumSales(long[] sales) {
        int peakMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[peakMinMonth]) {
                peakMinMonth = i;
            }
        }
        return peakMinMonth + 1;
    }

    public int monthBelowAverage(long[] sales){
        int counter = 0;
        long avarege = averageNumber(sales);
        for (long sale : sales) {
            if (sale < avarege){
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales){
        int counter = 0;
        long avarege = averageNumber(sales);
        for (long sale : sales) {
            if (sale > avarege){
                counter++;
            }
        }
        return counter;
    }
}
