package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findSumSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSale = 180;
        long actualSale = service.findsaleSum(sale);
        Assertions.assertEquals(expectedSale, actualSale);

    }

    @Test

    public void findaverAmount() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverSale = 15;

        long actualAverSale = service.findaveramount(sale);
        Assertions.assertEquals(expectedAverSale, actualAverSale);

    }

    @Test

    public void findMonthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);

    }

    @Test

    public void findMonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void findMonthUnderSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 5;
        long actualMinMonth = service.findUnderAveramount(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void findMonthHigherSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 5;
        long actualMaxMonth = service.findHigherAveramount(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }
}
