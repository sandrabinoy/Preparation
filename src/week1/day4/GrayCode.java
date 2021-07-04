package week1.day4;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public List<Integer> grayCode(int n) {

        List<Integer> grayList = new ArrayList<>();

        //First find 2^n
        int length = (int) Math.pow(2, n);

        //Find the binary values of all numbers between 0 and 2^n
        for(int i = 1; i < length; i++) {

            //Find the bit difference
            for(int j = 0; j <= n; j++) {

                int count = 0;

                if ((((i - 1) >> i) & 1) != ((i >> i) & 1)) {

                }

            }

        }

        return grayList;

    }

}
