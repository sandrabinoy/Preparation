package week1.day1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();

        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = new ArrayList<>();

        /*list = threeSum.sum(nums);

        for(int i = 0; i < list.size(); i++) {
            System.out.print("[");
            for(int j = 0; j < 3; j++) {
                System.out.print(list.get(i).get(j));
                if(j == 2)
                    continue;
                System.out.print(",");
            }
            System.out.println("]");
        }*/

        list.add(new ArrayList<>());
        list.get(0).add(2);
        list.add((new ArrayList<>()));
        list.get(1).add(4);
        int i = 0;
//        for(i = 0; i < list.size(); i++) {
//            System.out.print("[");
//            System.out.print(list.get(i).get(0));
//            System.out.println("]");
//        }


        //Palindrome
        ValidPalindrome palindrome = new ValidPalindrome();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "ab_a";
//        System.out.println(palindrome.isPalindrome(s1));
//        System.out.println(palindrome.isPalindrome(s2));


        //Remove Element
        RemoveElement remove = new RemoveElement();
        int[] arr = {-1,0,1,2,-1,-4};
        // -1, 0, 1, 2, -4, -1                      index--
        // -4, 0, 1, 2, -1, -1                      index--

        System.out.println(remove.removeElement(arr, -1));

//        int[] array = remove.removeElement(arr, -1);
//        for (int element: array) {
//            System.out.println(element);
//        }

    }

}
