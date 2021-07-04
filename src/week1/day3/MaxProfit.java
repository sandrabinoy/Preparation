package week1.day3;

public class MaxProfit {

    public int maxProfit(int[] prices) {

        int pricesLength = prices.length;
        int min = prices[0], max = prices[0];
        int minIndex = 0;

        for(int i = 0; i < pricesLength; i++) {

            if(prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }

        }

        max = min;

        System.out.println("Minimum value: " + min + "\tIndex at which min was found: " + minIndex);

        for(int i = minIndex; i < pricesLength; i++) {

            if(prices[i] > max) {
                max = prices[i];
            }

        }

        System.out.println("Maximum value: " + max);

        if((max - min) < 1)
            return 0;
        else
            return max - min;

    }

}
