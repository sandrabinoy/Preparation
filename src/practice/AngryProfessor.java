package practice;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {

    // https://www.hackerrank.com/challenges/angry-professor/problem
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-2);
        list.add(-4);
        list.add(8);
        list.add(2);
        list.add(-19);
        list.add(2);

        int k = 4;

        System.out.println(isCancelled(list, k));

    }

    public static String isCancelled(List<Integer> list, int k) {

        int n = list.size();
        int onTime = 0;

        for(int i = 0; i < n; i++) {

            if(list.get(i) <= k) {
                onTime++;
            }

        }

        if(onTime >= k) {
            //Class not cancelled
            return "NO";
        }

        else {
            return "YES";
        }

    }

}
