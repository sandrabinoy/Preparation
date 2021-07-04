package week1.day4;

public class Main {

    public static void main(String[] args) {

        BitDifference difference = new BitDifference();
        System.out.println("Number of different bits: " + difference.bitDifference(12, 11));
        System.out.println("Number of different bits: " + difference.bitDifference(1, 23));
        System.out.println("Number of different bits: " + difference.bitDifference(18, 6));
        System.out.println("Number of different bits: " + difference.bitDifference(25, 10));
        System.out.println("Number of different bits: " + difference.bitDifference(3, 81));

    }

}
