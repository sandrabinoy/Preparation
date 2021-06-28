package week1.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> sum(int[] nums) {

        int iteration = 0;
        List<List<Integer>> list = new ArrayList<>();
        int inputLength = nums.length;
        int sublets = 3;

        //Size of the array should be greater than sublets such that the sum of the sublets is equal to 0
        if(inputLength < sublets) {
            return list;
        }

        for(int i = 0; i < inputLength - 2; i++) {
            for(int j = i+1; j < inputLength - 1; j++) {
                for(int k = j+1; k < inputLength; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        list.get(iteration).add(i);
                        list.get(iteration).add(j);
                        list.get(iteration++).add(k);
                    }
                }
            }
        }

        return list;

    }

}
