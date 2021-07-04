package week1.day3;

public class Main {

    public static void main(String[] args) {

        int[] prices = { 7,1,5,3,6,4 };

        MaxProfit profit = new MaxProfit();

        System.out.println(profit.maxProfit(prices));

        //PlusOne
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {9};

        AddOne addOne = new AddOne();

        int[] digits1Ans = addOne.plusOne(digits1);
        int[] digits2Ans = addOne.plusOne(digits2);

        for(int i = 0; i < digits1Ans.length; i++) {
            System.out.print(digits1Ans[i] + "\t");
        }
        System.out.println();

        for(int i = 0; i < digits2Ans.length; i++) {
            System.out.print(digits2Ans[i] + "\t");
        }

    }

}
