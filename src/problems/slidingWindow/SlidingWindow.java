package problems.slidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lengthOfSpace = scan.nextInt();
        int windowSize = scan.nextInt();
        List<Integer> space = new ArrayList<>();

        /**
         * 5
         * 2
         * 1 2 3 2 1
         * O/P: (1, 2), (2, 3), (3, 2), (2, 1) -> 2
         */

        for(int i = 0; i < lengthOfSpace; i++) {
            space.add(scan.nextInt());
        }

        System.out.println(maxOfMin(windowSize, space));

    }

    public static int maxOfMin (int windowSize, List space) {
        int maxOfMinVal = 0;
        int minVal = 0;
        List<Integer> minValuesList = new ArrayList<>();

        for(int i = 0; i < space.size() - windowSize; i++) {
            minVal = (int) space.get(i);
            for(int j = i; j < i + windowSize; j++) {
                if((int) space.get(j) < minVal) {
                    minVal = (int) space.get(j);
                }
            }
            minValuesList.add(minVal);
        }

        maxOfMinVal = Collections.max(minValuesList);

        return maxOfMinVal;
    }

}
