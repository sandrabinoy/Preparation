package week1.day2;

public class InsertionPosition {

    public int searchInsert(int[] nums, int target) {

        int start = 0, end = nums.length, mid = 0;

        while(start < end) {

            mid = (start + end)/2;

            if(nums[mid] == target) {
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }

        }

        return start;

    }

}
