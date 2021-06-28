package practice;

public class RepeatedString {

    // https://www.hackerrank.com/challenges/repeated-string/problem

    public static void main(String[] args) {

        String s = "abbasbdaa";
        long n = 1000;
        System.out.println(repeatedString(s, n));

    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        char key = 'a';
        long count = 0l;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == key) {
                count++;
            }
        }

        long quot = n/s.length();
        count = count * quot;
        long rem = n%s.length();
        System.out.println(rem);

        for(int i = 0; i < rem; i++) {
            if(s.charAt(i) == key) {
                count++;
            }
        }

        return count;
    }


}
