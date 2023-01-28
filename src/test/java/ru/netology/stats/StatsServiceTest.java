package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSum(){
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(actual,expected);


    }
    @Test
    public void testSAverage(){
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testMonthMaxSale(){
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaxSale(sales);
        long expected =8;

        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testMonthMinSale(){
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinSale(sales);
        long expected =9;

        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testCalcMonthSalesBelowAverage(){
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMonthSalesBelowAverage(sales);
        long expected =5;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testCalcMonthSalesAboveAverage(){
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMonthSalesAboveAverage(sales);
        long expected =5;

        Assertions.assertEquals(actual,expected);
    }
}
