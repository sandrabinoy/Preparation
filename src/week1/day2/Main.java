package week1.day2;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target1 = 5, target2 = 2, target3 = 7, target4 = 0;
        InsertionPosition insertionPosition = new InsertionPosition();

        System.out.println(insertionPosition.searchInsert(nums, target1));
        System.out.println(insertionPosition.searchInsert(nums, target2));
        System.out.println(insertionPosition.searchInsert(nums, target3));
        System.out.println(insertionPosition.searchInsert(nums, target4));

    }

}
