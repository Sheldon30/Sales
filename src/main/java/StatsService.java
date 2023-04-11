public class StatsService {
    public long findsaleSum(long[] sale) {
        long saleSum = 0;
        for (long i : sale) {
            saleSum += i;
        }
        return saleSum;
    }

    public long findaveramount(long[] sale) {
        long averamount = 0;
        for (long i : sale) {
            averamount += i;

        }
        return averamount / sale.length;


    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int findUnderAveramount(long[] sales) {
        long minSaleMonth = 0;
        long average = findaveramount(sales);
        for (long sale: sales) {
            if (sale< average) {
                minSaleMonth++;
            }
        }
        return (int) minSaleMonth;
    }

    public int findHigherAveramount(long[] sales) {
        long maxSaleMonth = 0;
        long average = findaveramount(sales);
        for (long sale: sales) {
            if (sale< average) {
                maxSaleMonth++;
            }
        }
        return (int) maxSaleMonth;
    }
}


