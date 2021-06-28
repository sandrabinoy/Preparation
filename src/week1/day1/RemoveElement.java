package week1.day1;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                j++;
                nums[j] = nums[i];
                System.out.println(nums[j]);
            }
        }

        return j + 1;
        /*int arrLength = nums.length;
        int index = arrLength - 1;
        System.out.println("Index before: " + index);
        for(int i = index; i >= 0; i--) {
            if(nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                System.out.println("Iteration: " + i + "\tnumber: "  + nums[i]);
                index--;
            }
        }

        System.out.println("Index after: " + index);

        return index + 1;*/

    }

}
