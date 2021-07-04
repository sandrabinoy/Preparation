package week1.day4;

public class BitDifference {

    public int bitDifference(int num1, int num2) {

        int count = 0;

        // since, the numbers are less than 2^31
        // run the loop from '0' to '31' only
        for (int i = 0; i < 32; i++) {

            // right shift both the numbers by 'i' and
            // check if the bit at the 0th position is different
            if (((num1 >> i) & 1) != ((num2 >> i) & 1)) {
                count++;
            }
        }

        return count;

    }

}
