package week1.day3;

public class AddOne {

    public int[] plusOne(int[] digits) {

        int arrLength = digits.length;

        if(digits[arrLength - 1] < 9) {
            ++digits[arrLength - 1];
        }
        else {
            int[] newArray = new int[arrLength+1];
            for(int i = 0; i < arrLength - 1; i++) {

                newArray[i] = digits[i];

            }
            newArray[arrLength - 1] = 1;
            newArray[arrLength] = 0;

            return newArray;
        }
        return digits;

    }

}
